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
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.EventName.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.District.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Supervisor.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Mother.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Vdc.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class);
        modelClasses.add(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Table createTable(Class<? extends RealmModel> clazz, SharedRealm sharedRealm) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return io.realm.Event2DbParticipantsRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return io.realm.Event5DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return io.realm.Event10DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return io.realm.Event9DbPersonRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return io.realm.Event3DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return io.realm.Event7fDbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return io.realm.Event10DbTopicRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return io.realm.EventNameRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return io.realm.DistrictRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return io.realm.Event1DBRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return io.realm.Event6DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return io.realm.Event7gDbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return io.realm.Event9DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return io.realm.Event3DbTopicRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return io.realm.Event5DbParticipantRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return io.realm.Event8DbTopicRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return io.realm.Event7hDbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return io.realm.SupervisorRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return io.realm.Event7bDbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return io.realm.Event7dDbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return io.realm.Event6DbParticipantRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return io.realm.Event2DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return io.realm.Event7aDbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return io.realm.Event9DbTopicRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return io.realm.MotherRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return io.realm.Event12DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return io.realm.Event7cDbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return io.realm.Event11DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return io.realm.Event4DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return io.realm.VdcRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return io.realm.Event7eDbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return io.realm.Event8DbRealmProxy.initTable(sharedRealm);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.initTable(sharedRealm);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public RealmObjectSchema createRealmObjectSchema(Class<? extends RealmModel> clazz, RealmSchema realmSchema) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return io.realm.Event2DbParticipantsRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return io.realm.Event5DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return io.realm.Event10DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return io.realm.Event9DbPersonRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return io.realm.Event3DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return io.realm.Event7fDbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return io.realm.Event10DbTopicRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return io.realm.EventNameRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return io.realm.DistrictRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return io.realm.Event1DBRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return io.realm.Event6DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return io.realm.Event7gDbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return io.realm.Event9DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return io.realm.Event3DbTopicRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return io.realm.Event5DbParticipantRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return io.realm.Event8DbTopicRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return io.realm.Event7hDbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return io.realm.SupervisorRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return io.realm.Event7bDbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return io.realm.Event7dDbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return io.realm.Event6DbParticipantRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return io.realm.Event2DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return io.realm.Event7aDbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return io.realm.Event9DbTopicRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return io.realm.MotherRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return io.realm.Event12DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return io.realm.Event7cDbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return io.realm.Event11DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return io.realm.Event4DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return io.realm.VdcRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return io.realm.Event7eDbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return io.realm.Event8DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.createRealmObjectSchema(realmSchema);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public ColumnInfo validateTable(Class<? extends RealmModel> clazz, SharedRealm sharedRealm, boolean allowExtraColumns) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return io.realm.Event2DbParticipantsRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return io.realm.Event5DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return io.realm.Event10DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return io.realm.Event9DbPersonRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return io.realm.Event3DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return io.realm.Event7fDbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return io.realm.Event10DbTopicRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return io.realm.EventNameRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return io.realm.DistrictRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return io.realm.Event1DBRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return io.realm.Event6DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return io.realm.Event7gDbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return io.realm.Event9DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return io.realm.Event3DbTopicRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return io.realm.Event5DbParticipantRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return io.realm.Event8DbTopicRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return io.realm.Event7hDbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return io.realm.SupervisorRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return io.realm.Event7bDbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return io.realm.Event7dDbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return io.realm.Event6DbParticipantRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return io.realm.Event2DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return io.realm.Event7aDbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return io.realm.Event9DbTopicRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return io.realm.MotherRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return io.realm.Event12DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return io.realm.Event7cDbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return io.realm.Event11DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return io.realm.Event4DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return io.realm.VdcRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return io.realm.Event7eDbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return io.realm.Event8DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return io.realm.Event2DbParticipantsRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return io.realm.Event5DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return io.realm.Event10DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return io.realm.Event9DbPersonRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return io.realm.Event3DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return io.realm.Event7fDbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return io.realm.Event10DbTopicRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return io.realm.EventNameRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return io.realm.DistrictRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return io.realm.Event1DBRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return io.realm.Event6DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return io.realm.Event7gDbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return io.realm.Event9DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return io.realm.Event3DbTopicRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return io.realm.Event5DbParticipantRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return io.realm.Event8DbTopicRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return io.realm.Event7hDbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return io.realm.SupervisorRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return io.realm.Event7bDbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return io.realm.Event7dDbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return io.realm.Event6DbParticipantRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return io.realm.Event2DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return io.realm.Event7aDbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return io.realm.Event9DbTopicRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return io.realm.MotherRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return io.realm.Event12DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return io.realm.Event7cDbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return io.realm.Event11DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return io.realm.Event4DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return io.realm.VdcRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return io.realm.Event7eDbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return io.realm.Event8DbRealmProxy.getFieldNames();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return io.realm.ActivityPhase2DbRealmProxy.getFieldNames();
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public String getTableName(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return io.realm.Event2DbParticipantsRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return io.realm.Event5DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return io.realm.Event10DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return io.realm.Event9DbPersonRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return io.realm.Event3DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return io.realm.Event7fDbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return io.realm.Event10DbTopicRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return io.realm.EventNameRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return io.realm.DistrictRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return io.realm.Event1DBRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return io.realm.Event6DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return io.realm.Event7gDbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return io.realm.Event9DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return io.realm.ActivityPhase4DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return io.realm.Event3DbTopicRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return io.realm.Event5DbParticipantRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return io.realm.Event8DbTopicRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return io.realm.Event7hDbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return io.realm.SupervisorRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return io.realm.Event7bDbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return io.realm.Event7dDbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return io.realm.ActivityPhase3DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return io.realm.Event6DbParticipantRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return io.realm.Event2DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return io.realm.Event7aDbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return io.realm.Event9DbTopicRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return io.realm.MotherRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return io.realm.Event12DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return io.realm.Event7cDbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return io.realm.Event11DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return io.realm.Event4DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return io.realm.VdcRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return io.realm.ActivityPhase1DbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return io.realm.Event7eDbRealmProxy.getTableName();
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return io.realm.Event8DbRealmProxy.getTableName();
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

            if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
                return clazz.cast(new io.realm.Event2DbParticipantsRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
                return clazz.cast(new io.realm.Event5DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
                return clazz.cast(new io.realm.Event10DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
                return clazz.cast(new io.realm.Event9DbPersonRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
                return clazz.cast(new io.realm.Event3DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
                return clazz.cast(new io.realm.Event7fDbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
                return clazz.cast(new io.realm.Event10DbTopicRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
                return clazz.cast(new io.realm.EventNameRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
                return clazz.cast(new io.realm.DistrictRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
                return clazz.cast(new io.realm.Event1DBRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
                return clazz.cast(new io.realm.Event6DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
                return clazz.cast(new io.realm.Event7gDbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
                return clazz.cast(new io.realm.Event9DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                return clazz.cast(new io.realm.ActivityPhase4DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
                return clazz.cast(new io.realm.Event3DbTopicRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
                return clazz.cast(new io.realm.Event5DbParticipantRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
                return clazz.cast(new io.realm.Event8DbTopicRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
                return clazz.cast(new io.realm.Event7hDbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
                return clazz.cast(new io.realm.SupervisorRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
                return clazz.cast(new io.realm.Event7bDbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
                return clazz.cast(new io.realm.Event7dDbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                return clazz.cast(new io.realm.ActivityPhase3DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
                return clazz.cast(new io.realm.Event6DbParticipantRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
                return clazz.cast(new io.realm.Event2DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
                return clazz.cast(new io.realm.Event7aDbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
                return clazz.cast(new io.realm.Event9DbTopicRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
                return clazz.cast(new io.realm.MotherRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
                return clazz.cast(new io.realm.Event12DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
                return clazz.cast(new io.realm.Event7cDbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
                return clazz.cast(new io.realm.Event11DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
                return clazz.cast(new io.realm.Event4DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
                return clazz.cast(new io.realm.VdcRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                return clazz.cast(new io.realm.ActivityPhase1DbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
                return clazz.cast(new io.realm.Event7eDbRealmProxy());
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
                return clazz.cast(new io.realm.Event8DbRealmProxy());
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

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return clazz.cast(io.realm.Event2DbParticipantsRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return clazz.cast(io.realm.Event5DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return clazz.cast(io.realm.Event10DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return clazz.cast(io.realm.Event9DbPersonRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return clazz.cast(io.realm.Event3DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return clazz.cast(io.realm.Event7fDbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7fDb) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return clazz.cast(io.realm.Event10DbTopicRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return clazz.cast(io.realm.EventNameRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.EventName) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return clazz.cast(io.realm.DistrictRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.District) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return clazz.cast(io.realm.Event1DBRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event1DB) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return clazz.cast(io.realm.Event6DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return clazz.cast(io.realm.Event7gDbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7gDb) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return clazz.cast(io.realm.Event9DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return clazz.cast(io.realm.ActivityPhase4DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return clazz.cast(io.realm.Event3DbTopicRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return clazz.cast(io.realm.Event5DbParticipantRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return clazz.cast(io.realm.Event8DbTopicRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return clazz.cast(io.realm.Event7hDbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7hDb) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return clazz.cast(io.realm.SupervisorRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Supervisor) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return clazz.cast(io.realm.Event7bDbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7bDb) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return clazz.cast(io.realm.Event7dDbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7dDb) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return clazz.cast(io.realm.ActivityPhase3DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return clazz.cast(io.realm.Event6DbParticipantRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return clazz.cast(io.realm.Event2DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return clazz.cast(io.realm.Event7aDbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7aDb) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return clazz.cast(io.realm.Event9DbTopicRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return clazz.cast(io.realm.MotherRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Mother) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return clazz.cast(io.realm.Event12DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event12Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return clazz.cast(io.realm.Event7cDbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7cDb) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return clazz.cast(io.realm.Event11DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event11Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return clazz.cast(io.realm.Event4DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event4Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return clazz.cast(io.realm.VdcRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Vdc) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return clazz.cast(io.realm.ActivityPhase1DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return clazz.cast(io.realm.Event7eDbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7eDb) obj, update, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return clazz.cast(io.realm.Event8DbRealmProxy.copyOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8Db) obj, update, cache));
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

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            io.realm.Event2DbParticipantsRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            io.realm.Event5DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            io.realm.Event10DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            io.realm.Event9DbPersonRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            io.realm.Event3DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            io.realm.Event7fDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7fDb) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            io.realm.Event10DbTopicRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            io.realm.EventNameRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.EventName) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            io.realm.DistrictRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.District) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            io.realm.Event1DBRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event1DB) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            io.realm.Event6DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            io.realm.Event7gDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7gDb) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            io.realm.Event9DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            io.realm.ActivityPhase4DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            io.realm.Event3DbTopicRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            io.realm.Event5DbParticipantRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            io.realm.Event8DbTopicRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            io.realm.Event7hDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7hDb) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            io.realm.SupervisorRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Supervisor) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            io.realm.Event7bDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7bDb) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            io.realm.Event7dDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7dDb) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            io.realm.ActivityPhase3DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            io.realm.Event6DbParticipantRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            io.realm.Event2DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            io.realm.Event7aDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7aDb) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            io.realm.Event9DbTopicRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            io.realm.MotherRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Mother) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            io.realm.Event12DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event12Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            io.realm.Event7cDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7cDb) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            io.realm.Event11DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event11Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            io.realm.Event4DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event4Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            io.realm.VdcRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Vdc) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            io.realm.ActivityPhase1DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            io.realm.Event7eDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7eDb) object, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            io.realm.Event8DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8Db) object, cache);
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

            if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
                io.realm.Event2DbParticipantsRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
                io.realm.Event5DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
                io.realm.Event10DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
                io.realm.Event9DbPersonRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
                io.realm.Event3DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
                io.realm.Event7fDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7fDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
                io.realm.Event10DbTopicRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
                io.realm.EventNameRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.EventName) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
                io.realm.DistrictRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.District) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
                io.realm.Event1DBRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event1DB) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
                io.realm.Event6DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
                io.realm.Event7gDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7gDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
                io.realm.Event9DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                io.realm.ActivityPhase4DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
                io.realm.Event3DbTopicRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
                io.realm.Event5DbParticipantRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
                io.realm.Event8DbTopicRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
                io.realm.Event7hDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7hDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
                io.realm.SupervisorRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Supervisor) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
                io.realm.Event7bDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7bDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
                io.realm.Event7dDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7dDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                io.realm.ActivityPhase3DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
                io.realm.Event6DbParticipantRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
                io.realm.Event2DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
                io.realm.Event7aDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7aDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
                io.realm.Event9DbTopicRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
                io.realm.MotherRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Mother) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
                io.realm.Event12DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event12Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
                io.realm.Event7cDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7cDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
                io.realm.Event11DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event11Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
                io.realm.Event4DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event4Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
                io.realm.VdcRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Vdc) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                io.realm.ActivityPhase1DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
                io.realm.Event7eDbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7eDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
                io.realm.Event8DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
                io.realm.ActivityPhase2DbRealmProxy.insert(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
                    io.realm.Event2DbParticipantsRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
                    io.realm.Event5DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
                    io.realm.Event10DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
                    io.realm.Event9DbPersonRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
                    io.realm.Event3DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
                    io.realm.Event7fDbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
                    io.realm.Event10DbTopicRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
                    io.realm.EventNameRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
                    io.realm.DistrictRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
                    io.realm.Event1DBRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
                    io.realm.Event6DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
                    io.realm.Event7gDbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
                    io.realm.Event9DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                    io.realm.ActivityPhase4DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
                    io.realm.Event3DbTopicRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
                    io.realm.Event5DbParticipantRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
                    io.realm.Event8DbTopicRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
                    io.realm.Event7hDbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
                    io.realm.SupervisorRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
                    io.realm.Event7bDbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
                    io.realm.Event7dDbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                    io.realm.ActivityPhase3DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
                    io.realm.Event6DbParticipantRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
                    io.realm.Event2DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
                    io.realm.Event7aDbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
                    io.realm.Event9DbTopicRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
                    io.realm.MotherRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
                    io.realm.Event12DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
                    io.realm.Event7cDbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
                    io.realm.Event11DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
                    io.realm.Event4DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
                    io.realm.VdcRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                    io.realm.ActivityPhase1DbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
                    io.realm.Event7eDbRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
                    io.realm.Event8DbRealmProxy.insert(realm, iterator, cache);
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

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            io.realm.Event2DbParticipantsRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            io.realm.Event5DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            io.realm.Event10DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            io.realm.Event9DbPersonRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            io.realm.Event3DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            io.realm.Event7fDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7fDb) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            io.realm.Event10DbTopicRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            io.realm.EventNameRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.EventName) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            io.realm.DistrictRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.District) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            io.realm.Event1DBRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event1DB) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            io.realm.Event6DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            io.realm.Event7gDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7gDb) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            io.realm.Event9DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            io.realm.ActivityPhase4DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            io.realm.Event3DbTopicRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            io.realm.Event5DbParticipantRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            io.realm.Event8DbTopicRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            io.realm.Event7hDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7hDb) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            io.realm.SupervisorRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Supervisor) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            io.realm.Event7bDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7bDb) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            io.realm.Event7dDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7dDb) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            io.realm.ActivityPhase3DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            io.realm.Event6DbParticipantRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            io.realm.Event2DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            io.realm.Event7aDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7aDb) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            io.realm.Event9DbTopicRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            io.realm.MotherRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Mother) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            io.realm.Event12DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event12Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            io.realm.Event7cDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7cDb) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            io.realm.Event11DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event11Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            io.realm.Event4DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event4Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            io.realm.VdcRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Vdc) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            io.realm.ActivityPhase1DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            io.realm.Event7eDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7eDb) obj, cache);
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            io.realm.Event8DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8Db) obj, cache);
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

            if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
                io.realm.Event2DbParticipantsRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
                io.realm.Event5DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
                io.realm.Event10DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
                io.realm.Event9DbPersonRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
                io.realm.Event3DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
                io.realm.Event7fDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7fDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
                io.realm.Event10DbTopicRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
                io.realm.EventNameRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.EventName) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
                io.realm.DistrictRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.District) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
                io.realm.Event1DBRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event1DB) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
                io.realm.Event6DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
                io.realm.Event7gDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7gDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
                io.realm.Event9DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                io.realm.ActivityPhase4DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
                io.realm.Event3DbTopicRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
                io.realm.Event5DbParticipantRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
                io.realm.Event8DbTopicRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
                io.realm.Event7hDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7hDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
                io.realm.SupervisorRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Supervisor) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
                io.realm.Event7bDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7bDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
                io.realm.Event7dDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7dDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                io.realm.ActivityPhase3DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
                io.realm.Event6DbParticipantRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
                io.realm.Event2DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event2Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
                io.realm.Event7aDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7aDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
                io.realm.Event9DbTopicRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
                io.realm.MotherRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Mother) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
                io.realm.Event12DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event12Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
                io.realm.Event7cDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7cDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
                io.realm.Event11DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event11Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
                io.realm.Event4DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event4Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
                io.realm.VdcRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Vdc) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                io.realm.ActivityPhase1DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
                io.realm.Event7eDbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event7eDb) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
                io.realm.Event8DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Event.Event8Db) object, cache);
            } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
                io.realm.ActivityPhase2DbRealmProxy.insertOrUpdate(realm, (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
                    io.realm.Event2DbParticipantsRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
                    io.realm.Event5DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
                    io.realm.Event10DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
                    io.realm.Event9DbPersonRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
                    io.realm.Event3DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
                    io.realm.Event7fDbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
                    io.realm.Event10DbTopicRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
                    io.realm.EventNameRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
                    io.realm.DistrictRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
                    io.realm.Event1DBRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
                    io.realm.Event6DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
                    io.realm.Event7gDbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
                    io.realm.Event9DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
                    io.realm.ActivityPhase4DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
                    io.realm.Event3DbTopicRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
                    io.realm.Event5DbParticipantRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
                    io.realm.Event8DbTopicRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
                    io.realm.Event7hDbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
                    io.realm.SupervisorRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
                    io.realm.Event7bDbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
                    io.realm.Event7dDbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
                    io.realm.ActivityPhase3DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
                    io.realm.Event6DbParticipantRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
                    io.realm.Event2DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
                    io.realm.Event7aDbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
                    io.realm.Event9DbTopicRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
                    io.realm.MotherRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
                    io.realm.Event12DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
                    io.realm.Event7cDbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
                    io.realm.Event11DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
                    io.realm.Event4DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
                    io.realm.VdcRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
                    io.realm.ActivityPhase1DbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
                    io.realm.Event7eDbRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
                    io.realm.Event8DbRealmProxy.insertOrUpdate(realm, iterator, cache);
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

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return clazz.cast(io.realm.Event2DbParticipantsRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return clazz.cast(io.realm.Event5DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return clazz.cast(io.realm.Event10DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return clazz.cast(io.realm.Event9DbPersonRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return clazz.cast(io.realm.Event3DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return clazz.cast(io.realm.Event7fDbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return clazz.cast(io.realm.Event10DbTopicRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return clazz.cast(io.realm.EventNameRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return clazz.cast(io.realm.DistrictRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return clazz.cast(io.realm.Event1DBRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return clazz.cast(io.realm.Event6DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return clazz.cast(io.realm.Event7gDbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return clazz.cast(io.realm.Event9DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return clazz.cast(io.realm.ActivityPhase4DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return clazz.cast(io.realm.Event3DbTopicRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return clazz.cast(io.realm.Event5DbParticipantRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return clazz.cast(io.realm.Event8DbTopicRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return clazz.cast(io.realm.Event7hDbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return clazz.cast(io.realm.SupervisorRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return clazz.cast(io.realm.Event7bDbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return clazz.cast(io.realm.Event7dDbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return clazz.cast(io.realm.ActivityPhase3DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return clazz.cast(io.realm.Event6DbParticipantRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return clazz.cast(io.realm.Event2DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return clazz.cast(io.realm.Event7aDbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return clazz.cast(io.realm.Event9DbTopicRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return clazz.cast(io.realm.MotherRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return clazz.cast(io.realm.Event12DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return clazz.cast(io.realm.Event7cDbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return clazz.cast(io.realm.Event11DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return clazz.cast(io.realm.Event4DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return clazz.cast(io.realm.VdcRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return clazz.cast(io.realm.ActivityPhase1DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return clazz.cast(io.realm.Event7eDbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return clazz.cast(io.realm.Event8DbRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
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

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return clazz.cast(io.realm.Event2DbParticipantsRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return clazz.cast(io.realm.Event5DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return clazz.cast(io.realm.Event10DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return clazz.cast(io.realm.Event9DbPersonRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return clazz.cast(io.realm.Event3DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return clazz.cast(io.realm.Event7fDbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return clazz.cast(io.realm.Event10DbTopicRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return clazz.cast(io.realm.EventNameRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return clazz.cast(io.realm.DistrictRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return clazz.cast(io.realm.Event1DBRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return clazz.cast(io.realm.Event6DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return clazz.cast(io.realm.Event7gDbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return clazz.cast(io.realm.Event9DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return clazz.cast(io.realm.ActivityPhase4DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return clazz.cast(io.realm.Event3DbTopicRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return clazz.cast(io.realm.Event5DbParticipantRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return clazz.cast(io.realm.Event8DbTopicRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return clazz.cast(io.realm.Event7hDbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return clazz.cast(io.realm.SupervisorRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return clazz.cast(io.realm.Event7bDbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return clazz.cast(io.realm.Event7dDbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return clazz.cast(io.realm.ActivityPhase3DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return clazz.cast(io.realm.Event6DbParticipantRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return clazz.cast(io.realm.Event2DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return clazz.cast(io.realm.Event7aDbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return clazz.cast(io.realm.Event9DbTopicRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return clazz.cast(io.realm.MotherRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return clazz.cast(io.realm.Event12DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return clazz.cast(io.realm.Event7cDbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return clazz.cast(io.realm.Event11DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return clazz.cast(io.realm.Event4DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return clazz.cast(io.realm.VdcRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return clazz.cast(io.realm.ActivityPhase1DbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return clazz.cast(io.realm.Event7eDbRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return clazz.cast(io.realm.Event8DbRealmProxy.createUsingJsonStream(realm, reader));
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

        if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants.class)) {
            return clazz.cast(io.realm.Event2DbParticipantsRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event2DbParticipants) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5Db.class)) {
            return clazz.cast(io.realm.Event5DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event5Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10Db.class)) {
            return clazz.cast(io.realm.Event10DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event10Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson.class)) {
            return clazz.cast(io.realm.Event9DbPersonRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event9DbPerson) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3Db.class)) {
            return clazz.cast(io.realm.Event3DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event3Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7fDb.class)) {
            return clazz.cast(io.realm.Event7fDbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event7fDb) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic.class)) {
            return clazz.cast(io.realm.Event10DbTopicRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event10DbTopic) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.EventName.class)) {
            return clazz.cast(io.realm.EventNameRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.EventName) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.District.class)) {
            return clazz.cast(io.realm.DistrictRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.District) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event1DB.class)) {
            return clazz.cast(io.realm.Event1DBRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event1DB) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6Db.class)) {
            return clazz.cast(io.realm.Event6DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event6Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7gDb.class)) {
            return clazz.cast(io.realm.Event7gDbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event7gDb) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9Db.class)) {
            return clazz.cast(io.realm.Event9DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event9Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class)) {
            return clazz.cast(io.realm.ActivityPhase4DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic.class)) {
            return clazz.cast(io.realm.Event3DbTopicRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event3DbTopic) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant.class)) {
            return clazz.cast(io.realm.Event5DbParticipantRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event5DbParticipant) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic.class)) {
            return clazz.cast(io.realm.Event8DbTopicRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event8DbTopic) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7hDb.class)) {
            return clazz.cast(io.realm.Event7hDbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event7hDb) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Supervisor.class)) {
            return clazz.cast(io.realm.SupervisorRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Supervisor) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7bDb.class)) {
            return clazz.cast(io.realm.Event7bDbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event7bDb) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7dDb.class)) {
            return clazz.cast(io.realm.Event7dDbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event7dDb) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class)) {
            return clazz.cast(io.realm.ActivityPhase3DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant.class)) {
            return clazz.cast(io.realm.Event6DbParticipantRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event6DbParticipant) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event2Db.class)) {
            return clazz.cast(io.realm.Event2DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event2Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7aDb.class)) {
            return clazz.cast(io.realm.Event7aDbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event7aDb) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic.class)) {
            return clazz.cast(io.realm.Event9DbTopicRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event9DbTopic) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Mother.class)) {
            return clazz.cast(io.realm.MotherRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Mother) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event12Db.class)) {
            return clazz.cast(io.realm.Event12DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event12Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7cDb.class)) {
            return clazz.cast(io.realm.Event7cDbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event7cDb) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event11Db.class)) {
            return clazz.cast(io.realm.Event11DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event11Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event4Db.class)) {
            return clazz.cast(io.realm.Event4DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event4Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Vdc.class)) {
            return clazz.cast(io.realm.VdcRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Vdc) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class)) {
            return clazz.cast(io.realm.ActivityPhase1DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event7eDb.class)) {
            return clazz.cast(io.realm.Event7eDbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event7eDb) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Event.Event8Db.class)) {
            return clazz.cast(io.realm.Event8DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Event.Event8Db) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class)) {
            return clazz.cast(io.realm.ActivityPhase2DbRealmProxy.createDetachedCopy((mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) realmObject, 0, maxDepth, cache));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
