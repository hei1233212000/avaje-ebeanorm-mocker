package com.avaje.ebean;

import com.avaje.ebean.cache.ServerCacheManager;
import com.avaje.ebean.meta.MetaInfoManager;
import com.avaje.ebean.text.csv.CsvReader;
import com.avaje.ebean.text.json.JsonContext;
import org.mockito.Mockito;

import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This is an EbeanServer implementation that does nothing.
 *
 * Uses Mockito to return mocks for most methods.
 */
public class NoopEbeanServer implements EbeanServer {

  protected String name = "noop";

  protected Object beanId = 42L;

  protected Object nextId = 43L;

  public NoopEbeanServer() {
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Object getBeanId(Object bean) {
    return beanId;
  }

  @Override
  public Object nextId(Class<?> beanType) {
    return nextId;
  }

  //-- Methods returning null ---------------------------------------

  @Override
  public <T> T findUnique(Query<T> query, Transaction transaction) {
    return null;
  }

  @Override
  public <T> T execute(TxScope scope, TxCallable<T> c) {
    return null;
  }

  @Override
  public <T> T execute(TxCallable<T> c) {
    return null;
  }


  //-- Noop or Mockito methods ---------------------------------------


  @Override
  public void shutdown(boolean shutdownDataSource, boolean deregisterDriver) {

  }

  @Override
  public AdminAutofetch getAdminAutofetch() {
    return Mockito.mock(AdminAutofetch.class);
  }

  @Override
  public ExpressionFactory getExpressionFactory() {
    return Mockito.mock(ExpressionFactory.class);
  }

  @Override
  public MetaInfoManager getMetaInfoManager() {
    return Mockito.mock(MetaInfoManager.class);
  }

  @Override
  public BeanState getBeanState(Object bean) {
    return Mockito.mock(BeanState.class);
  }

  @Override
  public Map<String, ValuePair> diff(Object a, Object b) {
    return Collections.EMPTY_MAP;
  }

  @Override
  public <T> T createEntityBean(Class<T> type) {
    return Mockito.mock(type);
  }

  @Override
  public <T> CsvReader<T> createCsvReader(Class<T> beanType) {
    return Mockito.mock(CsvReader.class);
  }

  @Override
  public <T> Query<T> createNamedQuery(Class<T> beanType, String namedQuery) {
    return Mockito.mock(Query.class);
  }

  @Override
  public <T> Query<T> createQuery(Class<T> beanType, String query) {
    return Mockito.mock(Query.class);
  }

  @Override
  public <T> Query<T> createQuery(Class<T> beanType) {
    return Mockito.mock(Query.class);
  }

  @Override
  public <T> Query<T> find(Class<T> beanType) {
    return Mockito.mock(Query.class);
  }

  @Override
  public <T> Filter<T> filter(Class<T> beanType) {
    return Mockito.mock(Filter.class);
  }

  @Override
  public <T> void sort(List<T> list, String sortByClause) {

  }

  @Override
  public <T> Update<T> createNamedUpdate(Class<T> beanType, String namedUpdate) {
    return Mockito.mock(Update.class);
  }

  @Override
  public <T> Update<T> createUpdate(Class<T> beanType, String ormUpdate) {
    return Mockito.mock(Update.class);
  }

  @Override
  public SqlQuery createSqlQuery(String sql) {
    return Mockito.mock(SqlQuery.class);
  }

  @Override
  public SqlQuery createNamedSqlQuery(String namedQuery) {
    return Mockito.mock(SqlQuery.class);
  }

  @Override
  public SqlUpdate createSqlUpdate(String sql) {
    return Mockito.mock(SqlUpdate.class);
  }

  @Override
  public CallableSql createCallableSql(String callableSql) {
    return Mockito.mock(CallableSql.class);
  }

  @Override
  public SqlUpdate createNamedSqlUpdate(String namedQuery) {
    return Mockito.mock(SqlUpdate.class);
  }

  @Override
  public void register(TransactionCallback transactionCallback) throws PersistenceException {

  }

  @Override
  public Transaction createTransaction() {
    return Mockito.mock(Transaction.class);
  }

  @Override
  public Transaction createTransaction(TxIsolation isolation) {
    return Mockito.mock(Transaction.class);
  }

  @Override
  public Transaction beginTransaction() {
    return Mockito.mock(Transaction.class);
  }

  @Override
  public Transaction beginTransaction(TxIsolation isolation) {
    return Mockito.mock(Transaction.class);
  }

  @Override
  public Transaction beginTransaction(TxScope scope) {
    return Mockito.mock(Transaction.class);
  }

  @Override
  public Transaction currentTransaction() {
    return Mockito.mock(Transaction.class);
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
    return Mockito.mock(beanType);
  }

  @Override
  public <T> T getReference(Class<T> beanType, Object id) {
    return Mockito.mock(beanType);
  }

  @Override
  public <T> int findRowCount(Query<T> query, Transaction transaction) {
    return 0;
  }

  @Override
  public <T> List<Object> findIds(Query<T> query, Transaction transaction) {
    return Mockito.mock(List.class);
  }

  @Override
  public <T> QueryIterator<T> findIterate(Query<T> query, Transaction transaction) {
    return Mockito.mock(QueryIterator.class);
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
    return Mockito.mock(List.class);
  }

  @Override
  public <T> FutureRowCount<T> findFutureRowCount(Query<T> query, Transaction transaction) {
    return Mockito.mock(FutureRowCount.class);
  }

  @Override
  public <T> FutureIds<T> findFutureIds(Query<T> query, Transaction transaction) {
    return Mockito.mock(FutureIds.class);
  }

  @Override
  public <T> FutureList<T> findFutureList(Query<T> query, Transaction transaction) {
    return Mockito.mock(FutureList.class);
  }

  @Override
  public SqlFutureList findFutureList(SqlQuery query, Transaction transaction) {
    return Mockito.mock(SqlFutureList.class);
  }

  @Override
  public <T> PagedList<T> findPagedList(Query<T> query, Transaction transaction, int pageIndex, int pageSize) {
    return Mockito.mock(PagedList.class);
  }

  @Override
  public <T> Set<T> findSet(Query<T> query, Transaction transaction) {
    return Mockito.mock(Set.class);
  }

  @Override
  public <T> Map<?, T> findMap(Query<T> query, Transaction transaction) {
    return Mockito.mock(Map.class);
  }

  @Override
  public List<SqlRow> findList(SqlQuery query, Transaction transaction) {
    return Mockito.mock(List.class);
  }

  @Override
  public Set<SqlRow> findSet(SqlQuery query, Transaction transaction) {
    return Mockito.mock(Set.class);
  }

  @Override
  public Map<?, SqlRow> findMap(SqlQuery query, Transaction transaction) {
    return Mockito.mock(Map.class);
  }

  @Override
  public SqlRow findUnique(SqlQuery query, Transaction transaction) {
    return Mockito.mock(SqlRow.class);
  }

  @Override
  public void save(Object bean) throws OptimisticLockException {

  }

  @Override
  public int save(Iterator<?> it) throws OptimisticLockException {
    return 0;
  }

  @Override
  public int save(Collection<?> beans) throws OptimisticLockException {
    return 0;
  }

  @Override
  public void delete(Object bean) throws OptimisticLockException {

  }

  @Override
  public int delete(Iterator<?> it) throws OptimisticLockException {
    return 0;
  }

  @Override
  public int delete(Collection<?> c) throws OptimisticLockException {
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
    return Mockito.mock(beanType);
  }

  @Override
  public void save(Object bean, Transaction transaction) throws OptimisticLockException {

  }

  @Override
  public int save(Iterator<?> it, Transaction transaction) throws OptimisticLockException {
    return 0;
  }

  @Override
  public int save(Collection<?> beans, Transaction transaction) throws OptimisticLockException {
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
  public ServerCacheManager getServerCacheManager() {
    return Mockito.mock(ServerCacheManager.class);
  }

  @Override
  public BackgroundExecutor getBackgroundExecutor() {
    return Mockito.mock(BackgroundExecutor.class);
  }

  @Override
  public void runCacheWarming() {

  }

  @Override
  public void runCacheWarming(Class<?> beanType) {

  }

  @Override
  public JsonContext createJsonContext() {
    return Mockito.mock(JsonContext.class);
  }

  @Override
  public JsonContext json() {
    return Mockito.mock(JsonContext.class);
  }
}
