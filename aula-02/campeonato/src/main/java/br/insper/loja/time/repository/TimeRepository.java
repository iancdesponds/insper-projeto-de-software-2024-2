package br.insper.loja.time.repository;

import br.insper.loja.time.model.Time;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer> {

    public List<Time> findByEstado(String estado);

    @Override
    default void flush() {

    }

    @Override
    default <S extends Time> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    default <S extends Time> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    default void deleteAllInBatch(Iterable<Time> entities) {

    }

    @Override
    default void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default Time getOne(Integer integer) {
        return null;
    }

    @Override
    default Time getById(Integer integer) {
        return null;
    }

    @Override
    default Time getReferenceById(Integer integer) {
        return null;
    }

    @Override
    default <S extends Time> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Time> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default <S extends Time> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default List<Time> findAll() {
        return null;
    }

    @Override
    default List<Time> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    default <S extends Time> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Time> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Integer integer) {

    }

    @Override
    default void delete(Time entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    default void deleteAll(Iterable<? extends Time> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default List<Time> findAll(Sort sort) {
        return null;
    }

    @Override
    default Page<Time> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Time> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Time> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Time> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Time> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    default <S extends Time, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
