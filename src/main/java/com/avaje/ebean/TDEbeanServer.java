package com.avaje.ebean;

import com.avaje.ebean.cache.ServerCacheManager;
import com.avaje.ebean.meta.MetaInfoManager;
import com.avaje.ebean.text.csv.CsvReader;
import com.avaje.ebean.text.json.JsonContext;

import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Test double for EbeanServer.
 */
public class TDEbeanServer implements EbeanServer {

  public List deletedBeans = new ArrayList();

  public List savedBeans = new ArrayList();

  @Override
  public void shutdown(boolean shutdownDataSource, boolean deregisterDriver) {

  }

  @Override
  public AdminAutofetch getAdminAutofetch() {
    return null;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public ExpressionFactory getExpressionFactory() {
    return null;
  }

  @Override
  public MetaInfoManager getMetaInfoManager() {
    return null;
  }

  @Override
  public BeanState getBeanState(Object bean) {
    return null;
  }

  @Override
  public Object getBeanId(Object bean) {
    return null;
  }

  @Override
  public Map<String, ValuePair> diff(Object a, Object b) {
    return null;
  }

  @Override
  public <T> T createEntityBean(Class<T> type) {
    return null;
  }

  @Override
  public <T> CsvReader<T> createCsvReader(Class<T> beanType) {
    return null;
  }

  @Override
  public <T> Query<T> createNamedQuery(Class<T> beanType, String namedQuery) {
    return null;
  }

  @Override
  public <T> Query<T> createQuery(Class<T> beanType, String query) {
    return null;
  }

  @Override
  public <T> Query<T> createQuery(Class<T> beanType) {
    return null;
  }

  @Override
  public <T> Query<T> find(Class<T> beanType) {
    return null;
  }

  @Override
  public Object nextId(Class<?> beanType) {
    return null;
  }

  @Override
  public <T> Filter<T> filter(Class<T> beanType) {
    return null;
  }

  @Override
  public <T> void sort(List<T> list, String sortByClause) {

  }

  @Override
  public <T> Update<T> createNamedUpdate(Class<T> beanType, String namedUpdate) {
    return null;
  }

  @Override
  public <T> Update<T> createUpdate(Class<T> beanType, String ormUpdate) {
    return null;
  }

  @Override
  public SqlQuery createSqlQuery(String sql) {
    return null;
  }

  @Override
  public SqlQuery createNamedSqlQuery(String namedQuery) {
    return null;
  }

  @Override
  public SqlUpdate createSqlUpdate(String sql) {
    return null;
  }

  @Override
  public CallableSql createCallableSql(String callableSql) {
    return null;
  }

  @Override
  public SqlUpdate createNamedSqlUpdate(String namedQuery) {
    return null;
  }

  @Override
  public void register(TransactionCallback transactionCallback) throws PersistenceException {

  }

  @Override
  public Transaction createTransaction() {
    return null;
  }

  @Override
  public Transaction createTransaction(TxIsolation isolation) {
    return null;
  }

  @Override
  public Transaction beginTransaction() {
    return null;
  }

  @Override
  public Transaction beginTransaction(TxIsolation isolation) {
    return null;
  }

  @Override
  public Transaction beginTransaction(TxScope scope) {
    return null;
  }

  @Override
  public Transaction currentTransaction() {
    return null;
  }

  @Override
  public void commitTransaction() {

  }

  @Override
  public void rollbackTransaction() {

  }

  @Override
  public void endTransaction() {

  }

  @Override
  public void refresh(Object bean) {

  }

  @Override
  public void refreshMany(Object bean, String propertyName) {

  }

  @Override
  public <T> T find(Class<T> beanType, Object id) {
    return null;
  }

  @Override
  public <T> T getReference(Class<T> beanType, Object id) {
    return null;
  }

  @Override
  public <T> int findRowCount(Query<T> query, Transaction transaction) {
    return 0;
  }

  @Override
  public <T> List<Object> findIds(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> QueryIterator<T> findIterate(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> void findEach(Query<T> query, QueryEachConsumer<T> consumer, Transaction transaction) {

  }

  @Override
  public <T> void findEachWhile(Query<T> query, QueryEachWhileConsumer<T> consumer, Transaction transaction) {

  }

  @Override
  public <T> void findVisit(Query<T> query, QueryResultVisitor<T> visitor, Transaction transaction) {

  }

  @Override
  public <T> List<T> findList(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> FutureRowCount<T> findFutureRowCount(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> FutureIds<T> findFutureIds(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> FutureList<T> findFutureList(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public SqlFutureList findFutureList(SqlQuery query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> PagedList<T> findPagedList(Query<T> query, Transaction transaction, int pageIndex, int pageSize) {
    return null;
  }

  @Override
  public <T> Set<T> findSet(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> Map<?, T> findMap(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> T findUnique(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public List<SqlRow> findList(SqlQuery query, Transaction transaction) {
    return null;
  }

  @Override
  public Set<SqlRow> findSet(SqlQuery query, Transaction transaction) {
    return null;
  }

  @Override
  public Map<?, SqlRow> findMap(SqlQuery query, Transaction transaction) {
    return null;
  }

  @Override
  public SqlRow findUnique(SqlQuery query, Transaction transaction) {
    return null;
  }

  @Override
  public void save(Object bean) throws OptimisticLockException {
    savedBeans.add(bean);
  }

  @Override
  public int save(Iterator<?> it) throws OptimisticLockException {

    while (it.hasNext()) {
      savedBeans.add(it.next());
    }
    return 0;
  }

  @Override
  public int save(Collection<?> beans) throws OptimisticLockException {
    savedBeans.addAll(beans);
    return 0;
  }

  @Override
  public void delete(Object bean) throws OptimisticLockException {
    deletedBeans.add(bean);
  }

  @Override
  public int delete(Iterator<?> it) throws OptimisticLockException {
    while (it.hasNext()) {
      deletedBeans.add(it.next());
    }
    return 0;
  }

  @Override
  public int delete(Collection<?> c) throws OptimisticLockException {
    deletedBeans.addAll(c);
    return 0;
  }

  @Override
  public int delete(Class<?> beanType, Object id) {
    return 0;
  }

  @Override
  public int delete(Class<?> beanType, Object id, Transaction transaction) {
    return 0;
  }

  @Override
  public void delete(Class<?> beanType, Collection<?> ids) {

  }

  @Override
  public void delete(Class<?> beanType, Collection<?> ids, Transaction transaction) {

  }

  @Override
  public int execute(SqlUpdate sqlUpdate) {
    return 0;
  }

  @Override
  public int execute(Update<?> update) {
    return 0;
  }

  @Override
  public int execute(Update<?> update, Transaction t) {
    return 0;
  }

  @Override
  public int execute(CallableSql callableSql) {
    return 0;
  }

  @Override
  public void externalModification(String tableName, boolean inserted, boolean updated, boolean deleted) {

  }

  @Override
  public <T> T find(Class<T> beanType, Object uid, Transaction transaction) {
    return null;
  }

  @Override
  public void save(Object bean, Transaction transaction) throws OptimisticLockException {
    savedBeans.add(bean);
  }

  @Override
  public int save(Iterator<?> it, Transaction transaction) throws OptimisticLockException {
    while (it.hasNext()) {
      savedBeans.add(it.next());
    }
    return 0;
  }

  @Override
  public int save(Collection<?> beans, Transaction transaction) throws OptimisticLockException {
    savedBeans.addAll(beans);
    return 0;
  }

  @Override
  public void markAsDirty(Object bean) {

  }

  @Override
  public void update(Object bean) throws OptimisticLockException {

  }

  @Override
  public void update(Object bean, Transaction t) throws OptimisticLockException {

  }

  @Override
  public void update(Object bean, Transaction transaction, boolean deleteMissingChildren) throws OptimisticLockException {

  }

  @Override
  public void update(Collection<?> beans) throws OptimisticLockException {

  }

  @Override
  public void update(Collection<?> beans, Transaction transaction) throws OptimisticLockException {

  }

  @Override
  public void insert(Object bean) {

  }

  @Override
  public void insert(Object bean, Transaction t) {

  }

  @Override
  public void insert(Collection<?> beans) {

  }

  @Override
  public void insert(Collection<?> beans, Transaction t) {

  }

  @Override
  public int deleteManyToManyAssociations(Object ownerBean, String propertyName) {
    return 0;
  }

  @Override
  public int deleteManyToManyAssociations(Object ownerBean, String propertyName, Transaction t) {
    return 0;
  }

  @Override
  public void saveManyToManyAssociations(Object ownerBean, String propertyName) {

  }

  @Override
  public void saveManyToManyAssociations(Object ownerBean, String propertyName, Transaction t) {

  }

  @Override
  public void saveAssociation(Object ownerBean, String propertyName) {

  }

  @Override
  public void saveAssociation(Object ownerBean, String propertyName, Transaction t) {

  }

  @Override
  public void delete(Object bean, Transaction t) throws OptimisticLockException {

  }

  @Override
  public int delete(Iterator<?> it, Transaction t) throws OptimisticLockException {
    return 0;
  }

  @Override
  public int execute(SqlUpdate updSql, Transaction t) {
    return 0;
  }

  @Override
  public int execute(CallableSql callableSql, Transaction t) {
    return 0;
  }

  @Override
  public void execute(TxScope scope, TxRunnable r) {

  }

  @Override
  public void execute(TxRunnable r) {

  }

  @Override
  public <T> T execute(TxScope scope, TxCallable<T> c) {
    return null;
  }

  @Override
  public <T> T execute(TxCallable<T> c) {
    return null;
  }

  @Override
  public ServerCacheManager getServerCacheManager() {
    return null;
  }

  @Override
  public BackgroundExecutor getBackgroundExecutor() {
    return null;
  }

  @Override
  public void runCacheWarming() {

  }

  @Override
  public void runCacheWarming(Class<?> beanType) {

  }

  @Override
  public JsonContext createJsonContext() {
    return null;
  }

  @Override
  public JsonContext json() {
    return null;
  }
}
