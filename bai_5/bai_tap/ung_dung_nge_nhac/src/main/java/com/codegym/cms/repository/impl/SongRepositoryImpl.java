package com.codegym.cms.repository.impl;


import com.codegym.cms.model.Song;
import com.codegym.cms.repository.SongRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Transactional
public class SongRepositoryImpl implements SongRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Song> findAll() {
        TypedQuery<Song> query = em.createQuery("select c from Song c", Song.class);
        return query.getResultList();
    }

    @Override
    public Song findById(Long id) {
        TypedQuery<Song> query = em.createQuery("select c from Song c where  c.id=:id", Song.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Song model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Song customer = findById(id);
        if(customer != null){
            em.remove(customer);
        }
    }
}
