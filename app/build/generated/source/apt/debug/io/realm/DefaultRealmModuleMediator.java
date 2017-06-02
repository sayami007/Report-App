package io.realm;


import android.util.JsonReader;
import io.realm.RealmObjectSchema;
import io.realm.internal.ColumnInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>();
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Table createTable(Class<? extends RealmModel> clazz, SharedRealm sharedRealm) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.initTable(sharedRealm);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public RealmObjectSchema createRealmObjectSchema(Class<? extends RealmModel> clazz, RealmSchema realmSchema) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public ColumnInfo validateTable(Class<? extends RealmModel> clazz, SharedRealm sharedRealm, boolean allowExtraColumns) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.getFieldNames();
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public String getTableName(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.getTableName();
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                return clazz.cast(new io.realm.ActivityPhase3DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                return clazz.cast(new io.realm.ActivityPhase4DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                return clazz.cast(new io.realm.ActivityPhase1DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
                return clazz.cast(new io.realm.ActivityPhase2DbRealmProxy());
            } else {
                throw getMissingProxyClassException(clazz);
            }
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return clazz.cast(io.realm.ActivityPhase3DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return clazz.cast(io.realm.ActivityPhase4DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return clazz.cast(io.realm.ActivityPhase1DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return clazz.cast(io.realm.ActivityPhase2DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) obj, update, cache));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            io.realm.ActivityPhase3DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            io.realm.ActivityPhase4DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            io.realm.ActivityPhase1DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            io.realm.ActivityPhase2DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                io.realm.ActivityPhase3DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                io.realm.ActivityPhase4DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                io.realm.ActivityPhase1DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
                io.realm.ActivityPhase2DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                    io.realm.ActivityPhase3DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                    io.realm.ActivityPhase4DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                    io.realm.ActivityPhase1DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
                    io.realm.ActivityPhase2DbRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            io.realm.ActivityPhase3DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            io.realm.ActivityPhase4DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            io.realm.ActivityPhase1DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            io.realm.ActivityPhase2DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                io.realm.ActivityPhase3DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                io.realm.ActivityPhase4DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                io.realm.ActivityPhase1DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
                io.realm.ActivityPhase2DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                    io.realm.ActivityPhase3DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                    io.realm.ActivityPhase4DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                    io.realm.ActivityPhase1DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
                    io.realm.ActivityPhase2DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return clazz.cast(io.realm.ActivityPhase3DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return clazz.cast(io.realm.ActivityPhase4DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return clazz.cast(io.realm.ActivityPhase1DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return clazz.cast(io.realm.ActivityPhase2DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return clazz.cast(io.realm.ActivityPhase3DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return clazz.cast(io.realm.ActivityPhase4DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return clazz.cast(io.realm.ActivityPhase1DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return clazz.cast(io.realm.ActivityPhase2DbRealmProxy.createUsingJsonStream(realm, reader));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return clazz.cast(io.realm.ActivityPhase3DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return clazz.cast(io.realm.ActivityPhase4DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return clazz.cast(io.realm.ActivityPhase1DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return clazz.cast(io.realm.ActivityPhase2DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) realmObject, 0, maxDepth, cache));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
