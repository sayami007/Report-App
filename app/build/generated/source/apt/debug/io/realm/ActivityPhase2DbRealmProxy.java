package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.LinkView;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.TableOrView;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityPhase2DbRealmProxy extends mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db
    implements RealmObjectProxy, ActivityPhase2DbRealmProxyInterface {

    static final class ActivityPhase2DbColumnInfo extends ColumnInfo
        implements Cloneable {

        public long motherIndex;
        public long phaseAnswer1Index;
        public long phaseAnswer2Index;
        public long phaseAnswer3Index;
        public long phaseAnswer4Index;
        public long phaseAnswer5Index;
        public long phaseAnswer6Index;
        public long phaseAnswer7Index;
        public long phaseAnswer8Index;
        public long phaseAnswer9Index;
        public long phaseAnswer10Index;
        public long phaseAnswer11Index;
        public long phaseAnswer12Index;
        public long phaseAnswer13Index;
        public long phaseAnswer14Index;
        public long phaseAnswer15Index;
        public long phaseAnswer16Index;
        public long phaseAnswer17Index;
        public long phaseAnswer18Index;
        public long phaseAnswer19Index;
        public long phaseAnswer20Index;
        public long phaseAnswer21Index;
        public long phaseAnswer22Index;
        public long phaseAnswer23Index;
        public long phaseAnswer24Index;
        public long phaseAnswer25Index;
        public long phaseAnswer26Index;
        public long phaseAnswer27Index;
        public long phaseAnswer28Index;
        public long phaseAnswer29Index;
        public long phaseAnswer30Index;

        ActivityPhase2DbColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(31);
            this.motherIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "mother");
            indicesMap.put("mother", this.motherIndex);
            this.phaseAnswer1Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer1");
            indicesMap.put("phaseAnswer1", this.phaseAnswer1Index);
            this.phaseAnswer2Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer2");
            indicesMap.put("phaseAnswer2", this.phaseAnswer2Index);
            this.phaseAnswer3Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer3");
            indicesMap.put("phaseAnswer3", this.phaseAnswer3Index);
            this.phaseAnswer4Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer4");
            indicesMap.put("phaseAnswer4", this.phaseAnswer4Index);
            this.phaseAnswer5Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer5");
            indicesMap.put("phaseAnswer5", this.phaseAnswer5Index);
            this.phaseAnswer6Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer6");
            indicesMap.put("phaseAnswer6", this.phaseAnswer6Index);
            this.phaseAnswer7Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer7");
            indicesMap.put("phaseAnswer7", this.phaseAnswer7Index);
            this.phaseAnswer8Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer8");
            indicesMap.put("phaseAnswer8", this.phaseAnswer8Index);
            this.phaseAnswer9Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer9");
            indicesMap.put("phaseAnswer9", this.phaseAnswer9Index);
            this.phaseAnswer10Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer10");
            indicesMap.put("phaseAnswer10", this.phaseAnswer10Index);
            this.phaseAnswer11Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer11");
            indicesMap.put("phaseAnswer11", this.phaseAnswer11Index);
            this.phaseAnswer12Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer12");
            indicesMap.put("phaseAnswer12", this.phaseAnswer12Index);
            this.phaseAnswer13Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer13");
            indicesMap.put("phaseAnswer13", this.phaseAnswer13Index);
            this.phaseAnswer14Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer14");
            indicesMap.put("phaseAnswer14", this.phaseAnswer14Index);
            this.phaseAnswer15Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer15");
            indicesMap.put("phaseAnswer15", this.phaseAnswer15Index);
            this.phaseAnswer16Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer16");
            indicesMap.put("phaseAnswer16", this.phaseAnswer16Index);
            this.phaseAnswer17Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer17");
            indicesMap.put("phaseAnswer17", this.phaseAnswer17Index);
            this.phaseAnswer18Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer18");
            indicesMap.put("phaseAnswer18", this.phaseAnswer18Index);
            this.phaseAnswer19Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer19");
            indicesMap.put("phaseAnswer19", this.phaseAnswer19Index);
            this.phaseAnswer20Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer20");
            indicesMap.put("phaseAnswer20", this.phaseAnswer20Index);
            this.phaseAnswer21Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer21");
            indicesMap.put("phaseAnswer21", this.phaseAnswer21Index);
            this.phaseAnswer22Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer22");
            indicesMap.put("phaseAnswer22", this.phaseAnswer22Index);
            this.phaseAnswer23Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer23");
            indicesMap.put("phaseAnswer23", this.phaseAnswer23Index);
            this.phaseAnswer24Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer24");
            indicesMap.put("phaseAnswer24", this.phaseAnswer24Index);
            this.phaseAnswer25Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer25");
            indicesMap.put("phaseAnswer25", this.phaseAnswer25Index);
            this.phaseAnswer26Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer26");
            indicesMap.put("phaseAnswer26", this.phaseAnswer26Index);
            this.phaseAnswer27Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer27");
            indicesMap.put("phaseAnswer27", this.phaseAnswer27Index);
            this.phaseAnswer28Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer28");
            indicesMap.put("phaseAnswer28", this.phaseAnswer28Index);
            this.phaseAnswer29Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer29");
            indicesMap.put("phaseAnswer29", this.phaseAnswer29Index);
            this.phaseAnswer30Index = getValidColumnIndex(path, table, "ActivityPhase2Db", "phaseAnswer30");
            indicesMap.put("phaseAnswer30", this.phaseAnswer30Index);

            setIndicesMap(indicesMap);
        }

        @Override
        public final void copyColumnInfoFrom(ColumnInfo other) {
            final ActivityPhase2DbColumnInfo otherInfo = (ActivityPhase2DbColumnInfo) other;
            this.motherIndex = otherInfo.motherIndex;
            this.phaseAnswer1Index = otherInfo.phaseAnswer1Index;
            this.phaseAnswer2Index = otherInfo.phaseAnswer2Index;
            this.phaseAnswer3Index = otherInfo.phaseAnswer3Index;
            this.phaseAnswer4Index = otherInfo.phaseAnswer4Index;
            this.phaseAnswer5Index = otherInfo.phaseAnswer5Index;
            this.phaseAnswer6Index = otherInfo.phaseAnswer6Index;
            this.phaseAnswer7Index = otherInfo.phaseAnswer7Index;
            this.phaseAnswer8Index = otherInfo.phaseAnswer8Index;
            this.phaseAnswer9Index = otherInfo.phaseAnswer9Index;
            this.phaseAnswer10Index = otherInfo.phaseAnswer10Index;
            this.phaseAnswer11Index = otherInfo.phaseAnswer11Index;
            this.phaseAnswer12Index = otherInfo.phaseAnswer12Index;
            this.phaseAnswer13Index = otherInfo.phaseAnswer13Index;
            this.phaseAnswer14Index = otherInfo.phaseAnswer14Index;
            this.phaseAnswer15Index = otherInfo.phaseAnswer15Index;
            this.phaseAnswer16Index = otherInfo.phaseAnswer16Index;
            this.phaseAnswer17Index = otherInfo.phaseAnswer17Index;
            this.phaseAnswer18Index = otherInfo.phaseAnswer18Index;
            this.phaseAnswer19Index = otherInfo.phaseAnswer19Index;
            this.phaseAnswer20Index = otherInfo.phaseAnswer20Index;
            this.phaseAnswer21Index = otherInfo.phaseAnswer21Index;
            this.phaseAnswer22Index = otherInfo.phaseAnswer22Index;
            this.phaseAnswer23Index = otherInfo.phaseAnswer23Index;
            this.phaseAnswer24Index = otherInfo.phaseAnswer24Index;
            this.phaseAnswer25Index = otherInfo.phaseAnswer25Index;
            this.phaseAnswer26Index = otherInfo.phaseAnswer26Index;
            this.phaseAnswer27Index = otherInfo.phaseAnswer27Index;
            this.phaseAnswer28Index = otherInfo.phaseAnswer28Index;
            this.phaseAnswer29Index = otherInfo.phaseAnswer29Index;
            this.phaseAnswer30Index = otherInfo.phaseAnswer30Index;

            setIndicesMap(otherInfo.getIndicesMap());
        }

        @Override
        public final ActivityPhase2DbColumnInfo clone() {
            return (ActivityPhase2DbColumnInfo) super.clone();
        }

    }
    private ActivityPhase2DbColumnInfo columnInfo;
    private ProxyState proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("mother");
        fieldNames.add("phaseAnswer1");
        fieldNames.add("phaseAnswer2");
        fieldNames.add("phaseAnswer3");
        fieldNames.add("phaseAnswer4");
        fieldNames.add("phaseAnswer5");
        fieldNames.add("phaseAnswer6");
        fieldNames.add("phaseAnswer7");
        fieldNames.add("phaseAnswer8");
        fieldNames.add("phaseAnswer9");
        fieldNames.add("phaseAnswer10");
        fieldNames.add("phaseAnswer11");
        fieldNames.add("phaseAnswer12");
        fieldNames.add("phaseAnswer13");
        fieldNames.add("phaseAnswer14");
        fieldNames.add("phaseAnswer15");
        fieldNames.add("phaseAnswer16");
        fieldNames.add("phaseAnswer17");
        fieldNames.add("phaseAnswer18");
        fieldNames.add("phaseAnswer19");
        fieldNames.add("phaseAnswer20");
        fieldNames.add("phaseAnswer21");
        fieldNames.add("phaseAnswer22");
        fieldNames.add("phaseAnswer23");
        fieldNames.add("phaseAnswer24");
        fieldNames.add("phaseAnswer25");
        fieldNames.add("phaseAnswer26");
        fieldNames.add("phaseAnswer27");
        fieldNames.add("phaseAnswer28");
        fieldNames.add("phaseAnswer29");
        fieldNames.add("phaseAnswer30");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ActivityPhase2DbRealmProxy() {
        if (proxyState == null) {
            injectObjectContext();
        }
        proxyState.setConstructionFinished();
    }

    private void injectObjectContext() {
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ActivityPhase2DbColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class, this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    public mic.unlimited.com.reportingapp.Database.Mother realmGet$mother() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.motherIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(mic.unlimited.com.reportingapp.Database.Mother.class, proxyState.getRow$realm().getLink(columnInfo.motherIndex), false, Collections.<String>emptyList());
    }

    public void realmSet$mother(mic.unlimited.com.reportingapp.Database.Mother value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("mother")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.motherIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.motherIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.motherIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy)value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.motherIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer1() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer1Index);
    }

    public void realmSet$phaseAnswer1(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer1Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer1Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer1Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer2() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer2Index);
    }

    public void realmSet$phaseAnswer2(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer2Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer2Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer2Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer3() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer3Index);
    }

    public void realmSet$phaseAnswer3(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer3Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer3Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer3Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer3Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer4() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer4Index);
    }

    public void realmSet$phaseAnswer4(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer4Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer4Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer4Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer4Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer5() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer5Index);
    }

    public void realmSet$phaseAnswer5(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer5Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer5Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer5Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer5Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer6() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer6Index);
    }

    public void realmSet$phaseAnswer6(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer6Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer6Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer6Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer6Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer7() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer7Index);
    }

    public void realmSet$phaseAnswer7(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer7Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer7Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer7Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer7Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer8() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer8Index);
    }

    public void realmSet$phaseAnswer8(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer8Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer8Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer8Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer8Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer9() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer9Index);
    }

    public void realmSet$phaseAnswer9(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer9Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer9Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer9Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer9Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer10() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer10Index);
    }

    public void realmSet$phaseAnswer10(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer10Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer10Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer10Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer10Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer11() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer11Index);
    }

    public void realmSet$phaseAnswer11(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer11Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer11Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer11Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer11Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer12() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer12Index);
    }

    public void realmSet$phaseAnswer12(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer12Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer12Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer12Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer12Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer13() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer13Index);
    }

    public void realmSet$phaseAnswer13(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer13Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer13Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer13Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer13Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer14() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer14Index);
    }

    public void realmSet$phaseAnswer14(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer14Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer14Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer14Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer14Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer15() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer15Index);
    }

    public void realmSet$phaseAnswer15(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer15Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer15Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer15Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer15Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer16() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer16Index);
    }

    public void realmSet$phaseAnswer16(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer16Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer16Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer16Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer16Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer17() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer17Index);
    }

    public void realmSet$phaseAnswer17(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer17Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer17Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer17Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer17Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer18() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer18Index);
    }

    public void realmSet$phaseAnswer18(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer18Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer18Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer18Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer18Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer19() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer19Index);
    }

    public void realmSet$phaseAnswer19(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer19Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer19Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer19Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer19Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer20() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer20Index);
    }

    public void realmSet$phaseAnswer20(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer20Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer20Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer20Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer20Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer21() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer21Index);
    }

    public void realmSet$phaseAnswer21(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer21Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer21Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer21Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer21Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer22() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer22Index);
    }

    public void realmSet$phaseAnswer22(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer22Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer22Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer22Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer22Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer23() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer23Index);
    }

    public void realmSet$phaseAnswer23(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer23Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer23Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer23Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer23Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer24() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer24Index);
    }

    public void realmSet$phaseAnswer24(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer24Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer24Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer24Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer24Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer25() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer25Index);
    }

    public void realmSet$phaseAnswer25(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer25Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer25Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer25Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer25Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer26() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer26Index);
    }

    public void realmSet$phaseAnswer26(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer26Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer26Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer26Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer26Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer27() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer27Index);
    }

    public void realmSet$phaseAnswer27(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer27Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer27Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer27Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer27Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer28() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer28Index);
    }

    public void realmSet$phaseAnswer28(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer28Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer28Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer28Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer28Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer29() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer29Index);
    }

    public void realmSet$phaseAnswer29(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer29Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer29Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer29Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer29Index, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phaseAnswer30() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseAnswer30Index);
    }

    public void realmSet$phaseAnswer30(String value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseAnswer30Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseAnswer30Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseAnswer30Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseAnswer30Index, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("ActivityPhase2Db")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("ActivityPhase2Db");
            if (!realmSchema.contains("Mother")) {
                MotherRealmProxy.createRealmObjectSchema(realmSchema);
            }
            realmObjectSchema.add(new Property("mother", RealmFieldType.OBJECT, realmSchema.get("Mother")));
            realmObjectSchema.add(new Property("phaseAnswer1", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer2", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer3", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer4", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer5", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer6", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer7", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer8", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer9", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer10", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer11", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer12", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer13", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer14", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer15", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer16", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer17", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer18", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer19", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer20", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer21", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer22", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer23", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer24", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer25", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer26", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer27", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer28", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer29", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phaseAnswer30", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            return realmObjectSchema;
        }
        return realmSchema.get("ActivityPhase2Db");
    }

    public static Table initTable(SharedRealm sharedRealm) {
        if (!sharedRealm.hasTable("class_ActivityPhase2Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase2Db");
            if (!sharedRealm.hasTable("class_Mother")) {
                MotherRealmProxy.initTable(sharedRealm);
            }
            table.addColumnLink(RealmFieldType.OBJECT, "mother", sharedRealm.getTable("class_Mother"));
            table.addColumn(RealmFieldType.STRING, "phaseAnswer1", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer2", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer3", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer4", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer5", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer6", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer7", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer8", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer9", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer10", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer11", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer12", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer13", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer14", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer15", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer16", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer17", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer18", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer19", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer20", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer21", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer22", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer23", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer24", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer25", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer26", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer27", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer28", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer29", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phaseAnswer30", Table.NULLABLE);
            table.setPrimaryKey("");
            return table;
        }
        return sharedRealm.getTable("class_ActivityPhase2Db");
    }

    public static ActivityPhase2DbColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (sharedRealm.hasTable("class_ActivityPhase2Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase2Db");
            final long columnCount = table.getColumnCount();
            if (columnCount != 31) {
                if (columnCount < 31) {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 31 but was " + columnCount);
                }
                if (allowExtraColumns) {
                    RealmLog.debug("Field count is more than expected - expected 31 but was %1$d", columnCount);
                } else {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 31 but was " + columnCount);
                }
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < columnCount; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final ActivityPhase2DbColumnInfo columnInfo = new ActivityPhase2DbColumnInfo(sharedRealm.getPath(), table);

            if (!columnTypes.containsKey("mother")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'mother' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("mother") != RealmFieldType.OBJECT) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Mother' for field 'mother'");
            }
            if (!sharedRealm.hasTable("class_Mother")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Mother' for field 'mother'");
            }
            Table table_0 = sharedRealm.getTable("class_Mother");
            if (!table.getLinkTarget(columnInfo.motherIndex).hasSameSchema(table_0)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'mother': '" + table.getLinkTarget(columnInfo.motherIndex).getName() + "' expected - was '" + table_0.getName() + "'");
            }
            if (!columnTypes.containsKey("phaseAnswer1")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer1' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer1") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer1' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer1Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer1' is required. Either set @Required to field 'phaseAnswer1' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer2")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer2' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer2") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer2' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer2Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer2' is required. Either set @Required to field 'phaseAnswer2' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer3")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer3' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer3") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer3' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer3Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer3' is required. Either set @Required to field 'phaseAnswer3' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer4")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer4' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer4") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer4' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer4Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer4' is required. Either set @Required to field 'phaseAnswer4' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer5")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer5' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer5") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer5' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer5Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer5' is required. Either set @Required to field 'phaseAnswer5' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer6")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer6' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer6") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer6' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer6Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer6' is required. Either set @Required to field 'phaseAnswer6' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer7")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer7' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer7") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer7' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer7Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer7' is required. Either set @Required to field 'phaseAnswer7' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer8")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer8' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer8") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer8' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer8Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer8' is required. Either set @Required to field 'phaseAnswer8' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer9")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer9' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer9") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer9' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer9Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer9' is required. Either set @Required to field 'phaseAnswer9' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer10")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer10' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer10") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer10' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer10Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer10' is required. Either set @Required to field 'phaseAnswer10' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer11")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer11' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer11") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer11' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer11Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer11' is required. Either set @Required to field 'phaseAnswer11' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer12")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer12' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer12") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer12' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer12Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer12' is required. Either set @Required to field 'phaseAnswer12' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer13")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer13' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer13") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer13' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer13Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer13' is required. Either set @Required to field 'phaseAnswer13' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer14")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer14' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer14") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer14' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer14Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer14' is required. Either set @Required to field 'phaseAnswer14' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer15")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer15' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer15") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer15' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer15Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer15' is required. Either set @Required to field 'phaseAnswer15' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer16")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer16' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer16") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer16' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer16Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer16' is required. Either set @Required to field 'phaseAnswer16' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer17")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer17' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer17") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer17' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer17Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer17' is required. Either set @Required to field 'phaseAnswer17' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer18")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer18' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer18") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer18' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer18Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer18' is required. Either set @Required to field 'phaseAnswer18' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer19")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer19' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer19") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer19' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer19Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer19' is required. Either set @Required to field 'phaseAnswer19' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer20")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer20' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer20") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer20' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer20Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer20' is required. Either set @Required to field 'phaseAnswer20' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer21")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer21' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer21") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer21' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer21Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer21' is required. Either set @Required to field 'phaseAnswer21' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer22")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer22' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer22") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer22' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer22Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer22' is required. Either set @Required to field 'phaseAnswer22' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer23")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer23' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer23") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer23' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer23Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer23' is required. Either set @Required to field 'phaseAnswer23' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer24")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer24' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer24") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer24' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer24Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer24' is required. Either set @Required to field 'phaseAnswer24' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer25")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer25' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer25") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer25' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer25Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer25' is required. Either set @Required to field 'phaseAnswer25' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer26")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer26' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer26") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer26' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer26Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer26' is required. Either set @Required to field 'phaseAnswer26' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer27")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer27' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer27") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer27' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer27Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer27' is required. Either set @Required to field 'phaseAnswer27' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer28")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer28' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer28") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer28' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer28Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer28' is required. Either set @Required to field 'phaseAnswer28' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer29")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer29' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer29") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer29' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer29Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer29' is required. Either set @Required to field 'phaseAnswer29' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phaseAnswer30")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phaseAnswer30' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phaseAnswer30") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phaseAnswer30' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phaseAnswer30Index)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phaseAnswer30' is required. Either set @Required to field 'phaseAnswer30' or migrate using RealmObjectSchema.setNullable().");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'ActivityPhase2Db' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_ActivityPhase2Db";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("mother")) {
            excludeFields.add("mother");
        }
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db obj = realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class, true, excludeFields);
        if (json.has("mother")) {
            if (json.isNull("mother")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$mother(null);
            } else {
                mic.unlimited.com.reportingapp.Database.Mother motherObj = MotherRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("mother"), update);
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$mother(motherObj);
            }
        }
        if (json.has("phaseAnswer1")) {
            if (json.isNull("phaseAnswer1")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer1(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer1((String) json.getString("phaseAnswer1"));
            }
        }
        if (json.has("phaseAnswer2")) {
            if (json.isNull("phaseAnswer2")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer2(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer2((String) json.getString("phaseAnswer2"));
            }
        }
        if (json.has("phaseAnswer3")) {
            if (json.isNull("phaseAnswer3")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer3(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer3((String) json.getString("phaseAnswer3"));
            }
        }
        if (json.has("phaseAnswer4")) {
            if (json.isNull("phaseAnswer4")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer4(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer4((String) json.getString("phaseAnswer4"));
            }
        }
        if (json.has("phaseAnswer5")) {
            if (json.isNull("phaseAnswer5")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer5(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer5((String) json.getString("phaseAnswer5"));
            }
        }
        if (json.has("phaseAnswer6")) {
            if (json.isNull("phaseAnswer6")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer6(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer6((String) json.getString("phaseAnswer6"));
            }
        }
        if (json.has("phaseAnswer7")) {
            if (json.isNull("phaseAnswer7")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer7(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer7((String) json.getString("phaseAnswer7"));
            }
        }
        if (json.has("phaseAnswer8")) {
            if (json.isNull("phaseAnswer8")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer8(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer8((String) json.getString("phaseAnswer8"));
            }
        }
        if (json.has("phaseAnswer9")) {
            if (json.isNull("phaseAnswer9")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer9(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer9((String) json.getString("phaseAnswer9"));
            }
        }
        if (json.has("phaseAnswer10")) {
            if (json.isNull("phaseAnswer10")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer10(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer10((String) json.getString("phaseAnswer10"));
            }
        }
        if (json.has("phaseAnswer11")) {
            if (json.isNull("phaseAnswer11")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer11(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer11((String) json.getString("phaseAnswer11"));
            }
        }
        if (json.has("phaseAnswer12")) {
            if (json.isNull("phaseAnswer12")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer12(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer12((String) json.getString("phaseAnswer12"));
            }
        }
        if (json.has("phaseAnswer13")) {
            if (json.isNull("phaseAnswer13")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer13(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer13((String) json.getString("phaseAnswer13"));
            }
        }
        if (json.has("phaseAnswer14")) {
            if (json.isNull("phaseAnswer14")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer14(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer14((String) json.getString("phaseAnswer14"));
            }
        }
        if (json.has("phaseAnswer15")) {
            if (json.isNull("phaseAnswer15")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer15(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer15((String) json.getString("phaseAnswer15"));
            }
        }
        if (json.has("phaseAnswer16")) {
            if (json.isNull("phaseAnswer16")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer16(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer16((String) json.getString("phaseAnswer16"));
            }
        }
        if (json.has("phaseAnswer17")) {
            if (json.isNull("phaseAnswer17")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer17(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer17((String) json.getString("phaseAnswer17"));
            }
        }
        if (json.has("phaseAnswer18")) {
            if (json.isNull("phaseAnswer18")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer18(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer18((String) json.getString("phaseAnswer18"));
            }
        }
        if (json.has("phaseAnswer19")) {
            if (json.isNull("phaseAnswer19")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer19(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer19((String) json.getString("phaseAnswer19"));
            }
        }
        if (json.has("phaseAnswer20")) {
            if (json.isNull("phaseAnswer20")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer20(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer20((String) json.getString("phaseAnswer20"));
            }
        }
        if (json.has("phaseAnswer21")) {
            if (json.isNull("phaseAnswer21")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer21(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer21((String) json.getString("phaseAnswer21"));
            }
        }
        if (json.has("phaseAnswer22")) {
            if (json.isNull("phaseAnswer22")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer22(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer22((String) json.getString("phaseAnswer22"));
            }
        }
        if (json.has("phaseAnswer23")) {
            if (json.isNull("phaseAnswer23")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer23(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer23((String) json.getString("phaseAnswer23"));
            }
        }
        if (json.has("phaseAnswer24")) {
            if (json.isNull("phaseAnswer24")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer24(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer24((String) json.getString("phaseAnswer24"));
            }
        }
        if (json.has("phaseAnswer25")) {
            if (json.isNull("phaseAnswer25")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer25(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer25((String) json.getString("phaseAnswer25"));
            }
        }
        if (json.has("phaseAnswer26")) {
            if (json.isNull("phaseAnswer26")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer26(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer26((String) json.getString("phaseAnswer26"));
            }
        }
        if (json.has("phaseAnswer27")) {
            if (json.isNull("phaseAnswer27")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer27(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer27((String) json.getString("phaseAnswer27"));
            }
        }
        if (json.has("phaseAnswer28")) {
            if (json.isNull("phaseAnswer28")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer28(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer28((String) json.getString("phaseAnswer28"));
            }
        }
        if (json.has("phaseAnswer29")) {
            if (json.isNull("phaseAnswer29")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer29(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer29((String) json.getString("phaseAnswer29"));
            }
        }
        if (json.has("phaseAnswer30")) {
            if (json.isNull("phaseAnswer30")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer30(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer30((String) json.getString("phaseAnswer30"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db obj = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("mother")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$mother(null);
                } else {
                    mic.unlimited.com.reportingapp.Database.Mother motherObj = MotherRealmProxy.createUsingJsonStream(realm, reader);
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$mother(motherObj);
                }
            } else if (name.equals("phaseAnswer1")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer1(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer1((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer2")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer2(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer2((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer3")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer3(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer3((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer4")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer4(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer4((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer5")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer5(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer5((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer6")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer6(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer6((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer7")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer7(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer7((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer8")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer8(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer8((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer9")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer9(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer9((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer10")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer10(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer10((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer11")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer11(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer11((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer12")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer12(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer12((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer13")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer13(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer13((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer14")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer14(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer14((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer15")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer15(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer15((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer16")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer16(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer16((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer17")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer17(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer17((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer18")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer18(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer18((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer19")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer19(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer19((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer20")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer20(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer20((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer21")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer21(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer21((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer22")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer22(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer22((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer23")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer23(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer23((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer24")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer24(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer24((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer25")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer25(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer25((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer26")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer26(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer26((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer27")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer27(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer27((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer28")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer28(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer28((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer29")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer29(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer29((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer30")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer30(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phaseAnswer30((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db copyOrUpdate(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) cachedRealmObject;
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db copy(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db realmObject = realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class, false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);

            mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$mother();
            if (motherObj != null) {
                mic.unlimited.com.reportingapp.Database.Mother cachemother = (mic.unlimited.com.reportingapp.Database.Mother) cache.get(motherObj);
                if (cachemother != null) {
                    ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$mother(cachemother);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$mother(MotherRealmProxy.copyOrUpdate(realm, motherObj, update, cache));
                }
            } else {
                ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$mother(null);
            }
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer1(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer1());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer2(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer2());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer3(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer3());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer4(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer4());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer5(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer5());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer6(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer6());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer7(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer7());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer8(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer8());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer9(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer9());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer10(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer10());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer11(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer11());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer12(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer12());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer13(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer13());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer14(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer14());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer15(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer15());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer16(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer16());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer17(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer17());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer18(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer18());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer19(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer19());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer20(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer20());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer21(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer21());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer22(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer22());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer23(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer23());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer24(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer24());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer25(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer25());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer26(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer26());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer27(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer27());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer28(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer28());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer29(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer29());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phaseAnswer30(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phaseAnswer30());
            return realmObject;
        }
    }

    public static long insert(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase2DbColumnInfo columnInfo = (ActivityPhase2DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
        cache.put(object, rowIndex);

        mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase2DbRealmProxyInterface) object).realmGet$mother();
        if (motherObj != null) {
            Long cachemother = cache.get(motherObj);
            if (cachemother == null) {
                cachemother = MotherRealmProxy.insert(realm, motherObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.motherIndex, rowIndex, cachemother, false);
        }
        String realmGet$phaseAnswer1 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer1();
        if (realmGet$phaseAnswer1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, realmGet$phaseAnswer1, false);
        }
        String realmGet$phaseAnswer2 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer2();
        if (realmGet$phaseAnswer2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, realmGet$phaseAnswer2, false);
        }
        String realmGet$phaseAnswer3 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer3();
        if (realmGet$phaseAnswer3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, realmGet$phaseAnswer3, false);
        }
        String realmGet$phaseAnswer4 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer4();
        if (realmGet$phaseAnswer4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, realmGet$phaseAnswer4, false);
        }
        String realmGet$phaseAnswer5 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer5();
        if (realmGet$phaseAnswer5 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, realmGet$phaseAnswer5, false);
        }
        String realmGet$phaseAnswer6 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer6();
        if (realmGet$phaseAnswer6 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, realmGet$phaseAnswer6, false);
        }
        String realmGet$phaseAnswer7 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer7();
        if (realmGet$phaseAnswer7 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, realmGet$phaseAnswer7, false);
        }
        String realmGet$phaseAnswer8 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer8();
        if (realmGet$phaseAnswer8 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, realmGet$phaseAnswer8, false);
        }
        String realmGet$phaseAnswer9 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer9();
        if (realmGet$phaseAnswer9 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, realmGet$phaseAnswer9, false);
        }
        String realmGet$phaseAnswer10 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer10();
        if (realmGet$phaseAnswer10 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, realmGet$phaseAnswer10, false);
        }
        String realmGet$phaseAnswer11 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer11();
        if (realmGet$phaseAnswer11 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, realmGet$phaseAnswer11, false);
        }
        String realmGet$phaseAnswer12 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer12();
        if (realmGet$phaseAnswer12 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, realmGet$phaseAnswer12, false);
        }
        String realmGet$phaseAnswer13 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer13();
        if (realmGet$phaseAnswer13 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, realmGet$phaseAnswer13, false);
        }
        String realmGet$phaseAnswer14 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer14();
        if (realmGet$phaseAnswer14 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, realmGet$phaseAnswer14, false);
        }
        String realmGet$phaseAnswer15 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer15();
        if (realmGet$phaseAnswer15 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, realmGet$phaseAnswer15, false);
        }
        String realmGet$phaseAnswer16 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer16();
        if (realmGet$phaseAnswer16 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, realmGet$phaseAnswer16, false);
        }
        String realmGet$phaseAnswer17 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer17();
        if (realmGet$phaseAnswer17 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, realmGet$phaseAnswer17, false);
        }
        String realmGet$phaseAnswer18 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer18();
        if (realmGet$phaseAnswer18 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, realmGet$phaseAnswer18, false);
        }
        String realmGet$phaseAnswer19 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer19();
        if (realmGet$phaseAnswer19 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, realmGet$phaseAnswer19, false);
        }
        String realmGet$phaseAnswer20 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer20();
        if (realmGet$phaseAnswer20 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer20Index, rowIndex, realmGet$phaseAnswer20, false);
        }
        String realmGet$phaseAnswer21 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer21();
        if (realmGet$phaseAnswer21 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer21Index, rowIndex, realmGet$phaseAnswer21, false);
        }
        String realmGet$phaseAnswer22 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer22();
        if (realmGet$phaseAnswer22 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer22Index, rowIndex, realmGet$phaseAnswer22, false);
        }
        String realmGet$phaseAnswer23 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer23();
        if (realmGet$phaseAnswer23 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer23Index, rowIndex, realmGet$phaseAnswer23, false);
        }
        String realmGet$phaseAnswer24 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer24();
        if (realmGet$phaseAnswer24 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer24Index, rowIndex, realmGet$phaseAnswer24, false);
        }
        String realmGet$phaseAnswer25 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer25();
        if (realmGet$phaseAnswer25 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer25Index, rowIndex, realmGet$phaseAnswer25, false);
        }
        String realmGet$phaseAnswer26 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer26();
        if (realmGet$phaseAnswer26 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer26Index, rowIndex, realmGet$phaseAnswer26, false);
        }
        String realmGet$phaseAnswer27 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer27();
        if (realmGet$phaseAnswer27 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer27Index, rowIndex, realmGet$phaseAnswer27, false);
        }
        String realmGet$phaseAnswer28 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer28();
        if (realmGet$phaseAnswer28 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer28Index, rowIndex, realmGet$phaseAnswer28, false);
        }
        String realmGet$phaseAnswer29 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer29();
        if (realmGet$phaseAnswer29 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer29Index, rowIndex, realmGet$phaseAnswer29, false);
        }
        String realmGet$phaseAnswer30 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer30();
        if (realmGet$phaseAnswer30 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer30Index, rowIndex, realmGet$phaseAnswer30, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase2DbColumnInfo columnInfo = (ActivityPhase2DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                cache.put(object, rowIndex);

                mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase2DbRealmProxyInterface) object).realmGet$mother();
                if (motherObj != null) {
                    Long cachemother = cache.get(motherObj);
                    if (cachemother == null) {
                        cachemother = MotherRealmProxy.insert(realm, motherObj, cache);
                    }
                    table.setLink(columnInfo.motherIndex, rowIndex, cachemother, false);
                }
                String realmGet$phaseAnswer1 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer1();
                if (realmGet$phaseAnswer1 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, realmGet$phaseAnswer1, false);
                }
                String realmGet$phaseAnswer2 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer2();
                if (realmGet$phaseAnswer2 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, realmGet$phaseAnswer2, false);
                }
                String realmGet$phaseAnswer3 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer3();
                if (realmGet$phaseAnswer3 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, realmGet$phaseAnswer3, false);
                }
                String realmGet$phaseAnswer4 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer4();
                if (realmGet$phaseAnswer4 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, realmGet$phaseAnswer4, false);
                }
                String realmGet$phaseAnswer5 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer5();
                if (realmGet$phaseAnswer5 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, realmGet$phaseAnswer5, false);
                }
                String realmGet$phaseAnswer6 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer6();
                if (realmGet$phaseAnswer6 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, realmGet$phaseAnswer6, false);
                }
                String realmGet$phaseAnswer7 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer7();
                if (realmGet$phaseAnswer7 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, realmGet$phaseAnswer7, false);
                }
                String realmGet$phaseAnswer8 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer8();
                if (realmGet$phaseAnswer8 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, realmGet$phaseAnswer8, false);
                }
                String realmGet$phaseAnswer9 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer9();
                if (realmGet$phaseAnswer9 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, realmGet$phaseAnswer9, false);
                }
                String realmGet$phaseAnswer10 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer10();
                if (realmGet$phaseAnswer10 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, realmGet$phaseAnswer10, false);
                }
                String realmGet$phaseAnswer11 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer11();
                if (realmGet$phaseAnswer11 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, realmGet$phaseAnswer11, false);
                }
                String realmGet$phaseAnswer12 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer12();
                if (realmGet$phaseAnswer12 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, realmGet$phaseAnswer12, false);
                }
                String realmGet$phaseAnswer13 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer13();
                if (realmGet$phaseAnswer13 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, realmGet$phaseAnswer13, false);
                }
                String realmGet$phaseAnswer14 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer14();
                if (realmGet$phaseAnswer14 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, realmGet$phaseAnswer14, false);
                }
                String realmGet$phaseAnswer15 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer15();
                if (realmGet$phaseAnswer15 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, realmGet$phaseAnswer15, false);
                }
                String realmGet$phaseAnswer16 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer16();
                if (realmGet$phaseAnswer16 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, realmGet$phaseAnswer16, false);
                }
                String realmGet$phaseAnswer17 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer17();
                if (realmGet$phaseAnswer17 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, realmGet$phaseAnswer17, false);
                }
                String realmGet$phaseAnswer18 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer18();
                if (realmGet$phaseAnswer18 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, realmGet$phaseAnswer18, false);
                }
                String realmGet$phaseAnswer19 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer19();
                if (realmGet$phaseAnswer19 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, realmGet$phaseAnswer19, false);
                }
                String realmGet$phaseAnswer20 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer20();
                if (realmGet$phaseAnswer20 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer20Index, rowIndex, realmGet$phaseAnswer20, false);
                }
                String realmGet$phaseAnswer21 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer21();
                if (realmGet$phaseAnswer21 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer21Index, rowIndex, realmGet$phaseAnswer21, false);
                }
                String realmGet$phaseAnswer22 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer22();
                if (realmGet$phaseAnswer22 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer22Index, rowIndex, realmGet$phaseAnswer22, false);
                }
                String realmGet$phaseAnswer23 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer23();
                if (realmGet$phaseAnswer23 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer23Index, rowIndex, realmGet$phaseAnswer23, false);
                }
                String realmGet$phaseAnswer24 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer24();
                if (realmGet$phaseAnswer24 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer24Index, rowIndex, realmGet$phaseAnswer24, false);
                }
                String realmGet$phaseAnswer25 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer25();
                if (realmGet$phaseAnswer25 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer25Index, rowIndex, realmGet$phaseAnswer25, false);
                }
                String realmGet$phaseAnswer26 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer26();
                if (realmGet$phaseAnswer26 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer26Index, rowIndex, realmGet$phaseAnswer26, false);
                }
                String realmGet$phaseAnswer27 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer27();
                if (realmGet$phaseAnswer27 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer27Index, rowIndex, realmGet$phaseAnswer27, false);
                }
                String realmGet$phaseAnswer28 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer28();
                if (realmGet$phaseAnswer28 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer28Index, rowIndex, realmGet$phaseAnswer28, false);
                }
                String realmGet$phaseAnswer29 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer29();
                if (realmGet$phaseAnswer29 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer29Index, rowIndex, realmGet$phaseAnswer29, false);
                }
                String realmGet$phaseAnswer30 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer30();
                if (realmGet$phaseAnswer30 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer30Index, rowIndex, realmGet$phaseAnswer30, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase2DbColumnInfo columnInfo = (ActivityPhase2DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
        cache.put(object, rowIndex);

        mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase2DbRealmProxyInterface) object).realmGet$mother();
        if (motherObj != null) {
            Long cachemother = cache.get(motherObj);
            if (cachemother == null) {
                cachemother = MotherRealmProxy.insertOrUpdate(realm, motherObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.motherIndex, rowIndex, cachemother, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.motherIndex, rowIndex);
        }
        String realmGet$phaseAnswer1 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer1();
        if (realmGet$phaseAnswer1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, realmGet$phaseAnswer1, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, false);
        }
        String realmGet$phaseAnswer2 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer2();
        if (realmGet$phaseAnswer2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, realmGet$phaseAnswer2, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, false);
        }
        String realmGet$phaseAnswer3 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer3();
        if (realmGet$phaseAnswer3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, realmGet$phaseAnswer3, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, false);
        }
        String realmGet$phaseAnswer4 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer4();
        if (realmGet$phaseAnswer4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, realmGet$phaseAnswer4, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, false);
        }
        String realmGet$phaseAnswer5 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer5();
        if (realmGet$phaseAnswer5 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, realmGet$phaseAnswer5, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, false);
        }
        String realmGet$phaseAnswer6 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer6();
        if (realmGet$phaseAnswer6 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, realmGet$phaseAnswer6, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, false);
        }
        String realmGet$phaseAnswer7 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer7();
        if (realmGet$phaseAnswer7 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, realmGet$phaseAnswer7, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, false);
        }
        String realmGet$phaseAnswer8 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer8();
        if (realmGet$phaseAnswer8 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, realmGet$phaseAnswer8, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, false);
        }
        String realmGet$phaseAnswer9 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer9();
        if (realmGet$phaseAnswer9 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, realmGet$phaseAnswer9, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, false);
        }
        String realmGet$phaseAnswer10 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer10();
        if (realmGet$phaseAnswer10 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, realmGet$phaseAnswer10, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, false);
        }
        String realmGet$phaseAnswer11 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer11();
        if (realmGet$phaseAnswer11 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, realmGet$phaseAnswer11, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, false);
        }
        String realmGet$phaseAnswer12 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer12();
        if (realmGet$phaseAnswer12 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, realmGet$phaseAnswer12, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, false);
        }
        String realmGet$phaseAnswer13 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer13();
        if (realmGet$phaseAnswer13 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, realmGet$phaseAnswer13, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, false);
        }
        String realmGet$phaseAnswer14 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer14();
        if (realmGet$phaseAnswer14 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, realmGet$phaseAnswer14, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, false);
        }
        String realmGet$phaseAnswer15 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer15();
        if (realmGet$phaseAnswer15 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, realmGet$phaseAnswer15, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, false);
        }
        String realmGet$phaseAnswer16 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer16();
        if (realmGet$phaseAnswer16 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, realmGet$phaseAnswer16, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, false);
        }
        String realmGet$phaseAnswer17 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer17();
        if (realmGet$phaseAnswer17 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, realmGet$phaseAnswer17, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, false);
        }
        String realmGet$phaseAnswer18 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer18();
        if (realmGet$phaseAnswer18 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, realmGet$phaseAnswer18, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, false);
        }
        String realmGet$phaseAnswer19 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer19();
        if (realmGet$phaseAnswer19 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, realmGet$phaseAnswer19, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, false);
        }
        String realmGet$phaseAnswer20 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer20();
        if (realmGet$phaseAnswer20 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer20Index, rowIndex, realmGet$phaseAnswer20, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer20Index, rowIndex, false);
        }
        String realmGet$phaseAnswer21 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer21();
        if (realmGet$phaseAnswer21 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer21Index, rowIndex, realmGet$phaseAnswer21, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer21Index, rowIndex, false);
        }
        String realmGet$phaseAnswer22 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer22();
        if (realmGet$phaseAnswer22 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer22Index, rowIndex, realmGet$phaseAnswer22, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer22Index, rowIndex, false);
        }
        String realmGet$phaseAnswer23 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer23();
        if (realmGet$phaseAnswer23 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer23Index, rowIndex, realmGet$phaseAnswer23, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer23Index, rowIndex, false);
        }
        String realmGet$phaseAnswer24 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer24();
        if (realmGet$phaseAnswer24 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer24Index, rowIndex, realmGet$phaseAnswer24, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer24Index, rowIndex, false);
        }
        String realmGet$phaseAnswer25 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer25();
        if (realmGet$phaseAnswer25 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer25Index, rowIndex, realmGet$phaseAnswer25, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer25Index, rowIndex, false);
        }
        String realmGet$phaseAnswer26 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer26();
        if (realmGet$phaseAnswer26 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer26Index, rowIndex, realmGet$phaseAnswer26, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer26Index, rowIndex, false);
        }
        String realmGet$phaseAnswer27 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer27();
        if (realmGet$phaseAnswer27 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer27Index, rowIndex, realmGet$phaseAnswer27, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer27Index, rowIndex, false);
        }
        String realmGet$phaseAnswer28 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer28();
        if (realmGet$phaseAnswer28 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer28Index, rowIndex, realmGet$phaseAnswer28, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer28Index, rowIndex, false);
        }
        String realmGet$phaseAnswer29 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer29();
        if (realmGet$phaseAnswer29 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer29Index, rowIndex, realmGet$phaseAnswer29, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer29Index, rowIndex, false);
        }
        String realmGet$phaseAnswer30 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer30();
        if (realmGet$phaseAnswer30 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer30Index, rowIndex, realmGet$phaseAnswer30, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer30Index, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase2DbColumnInfo columnInfo = (ActivityPhase2DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                cache.put(object, rowIndex);

                mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase2DbRealmProxyInterface) object).realmGet$mother();
                if (motherObj != null) {
                    Long cachemother = cache.get(motherObj);
                    if (cachemother == null) {
                        cachemother = MotherRealmProxy.insertOrUpdate(realm, motherObj, cache);
                    }
                    Table.nativeSetLink(tableNativePtr, columnInfo.motherIndex, rowIndex, cachemother, false);
                } else {
                    Table.nativeNullifyLink(tableNativePtr, columnInfo.motherIndex, rowIndex);
                }
                String realmGet$phaseAnswer1 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer1();
                if (realmGet$phaseAnswer1 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, realmGet$phaseAnswer1, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, false);
                }
                String realmGet$phaseAnswer2 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer2();
                if (realmGet$phaseAnswer2 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, realmGet$phaseAnswer2, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, false);
                }
                String realmGet$phaseAnswer3 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer3();
                if (realmGet$phaseAnswer3 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, realmGet$phaseAnswer3, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, false);
                }
                String realmGet$phaseAnswer4 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer4();
                if (realmGet$phaseAnswer4 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, realmGet$phaseAnswer4, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, false);
                }
                String realmGet$phaseAnswer5 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer5();
                if (realmGet$phaseAnswer5 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, realmGet$phaseAnswer5, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, false);
                }
                String realmGet$phaseAnswer6 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer6();
                if (realmGet$phaseAnswer6 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, realmGet$phaseAnswer6, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, false);
                }
                String realmGet$phaseAnswer7 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer7();
                if (realmGet$phaseAnswer7 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, realmGet$phaseAnswer7, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, false);
                }
                String realmGet$phaseAnswer8 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer8();
                if (realmGet$phaseAnswer8 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, realmGet$phaseAnswer8, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, false);
                }
                String realmGet$phaseAnswer9 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer9();
                if (realmGet$phaseAnswer9 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, realmGet$phaseAnswer9, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, false);
                }
                String realmGet$phaseAnswer10 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer10();
                if (realmGet$phaseAnswer10 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, realmGet$phaseAnswer10, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, false);
                }
                String realmGet$phaseAnswer11 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer11();
                if (realmGet$phaseAnswer11 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, realmGet$phaseAnswer11, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, false);
                }
                String realmGet$phaseAnswer12 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer12();
                if (realmGet$phaseAnswer12 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, realmGet$phaseAnswer12, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, false);
                }
                String realmGet$phaseAnswer13 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer13();
                if (realmGet$phaseAnswer13 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, realmGet$phaseAnswer13, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, false);
                }
                String realmGet$phaseAnswer14 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer14();
                if (realmGet$phaseAnswer14 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, realmGet$phaseAnswer14, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, false);
                }
                String realmGet$phaseAnswer15 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer15();
                if (realmGet$phaseAnswer15 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, realmGet$phaseAnswer15, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, false);
                }
                String realmGet$phaseAnswer16 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer16();
                if (realmGet$phaseAnswer16 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, realmGet$phaseAnswer16, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, false);
                }
                String realmGet$phaseAnswer17 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer17();
                if (realmGet$phaseAnswer17 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, realmGet$phaseAnswer17, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, false);
                }
                String realmGet$phaseAnswer18 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer18();
                if (realmGet$phaseAnswer18 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, realmGet$phaseAnswer18, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, false);
                }
                String realmGet$phaseAnswer19 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer19();
                if (realmGet$phaseAnswer19 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, realmGet$phaseAnswer19, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, false);
                }
                String realmGet$phaseAnswer20 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer20();
                if (realmGet$phaseAnswer20 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer20Index, rowIndex, realmGet$phaseAnswer20, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer20Index, rowIndex, false);
                }
                String realmGet$phaseAnswer21 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer21();
                if (realmGet$phaseAnswer21 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer21Index, rowIndex, realmGet$phaseAnswer21, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer21Index, rowIndex, false);
                }
                String realmGet$phaseAnswer22 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer22();
                if (realmGet$phaseAnswer22 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer22Index, rowIndex, realmGet$phaseAnswer22, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer22Index, rowIndex, false);
                }
                String realmGet$phaseAnswer23 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer23();
                if (realmGet$phaseAnswer23 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer23Index, rowIndex, realmGet$phaseAnswer23, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer23Index, rowIndex, false);
                }
                String realmGet$phaseAnswer24 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer24();
                if (realmGet$phaseAnswer24 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer24Index, rowIndex, realmGet$phaseAnswer24, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer24Index, rowIndex, false);
                }
                String realmGet$phaseAnswer25 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer25();
                if (realmGet$phaseAnswer25 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer25Index, rowIndex, realmGet$phaseAnswer25, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer25Index, rowIndex, false);
                }
                String realmGet$phaseAnswer26 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer26();
                if (realmGet$phaseAnswer26 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer26Index, rowIndex, realmGet$phaseAnswer26, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer26Index, rowIndex, false);
                }
                String realmGet$phaseAnswer27 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer27();
                if (realmGet$phaseAnswer27 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer27Index, rowIndex, realmGet$phaseAnswer27, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer27Index, rowIndex, false);
                }
                String realmGet$phaseAnswer28 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer28();
                if (realmGet$phaseAnswer28 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer28Index, rowIndex, realmGet$phaseAnswer28, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer28Index, rowIndex, false);
                }
                String realmGet$phaseAnswer29 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer29();
                if (realmGet$phaseAnswer29 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer29Index, rowIndex, realmGet$phaseAnswer29, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer29Index, rowIndex, false);
                }
                String realmGet$phaseAnswer30 = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phaseAnswer30();
                if (realmGet$phaseAnswer30 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer30Index, rowIndex, realmGet$phaseAnswer30, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer30Index, rowIndex, false);
                }
            }
        }
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db createDetachedCopy(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db)cachedObject.object;
            } else {
                unmanagedObject = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }

        // Deep copy of mother
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$mother(MotherRealmProxy.createDetachedCopy(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$mother(), currentDepth + 1, maxDepth, cache));
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer1(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer1());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer2(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer2());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer3(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer3());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer4(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer4());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer5(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer5());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer6(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer6());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer7(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer7());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer8(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer8());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer9(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer9());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer10(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer10());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer11(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer11());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer12(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer12());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer13(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer13());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer14(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer14());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer15(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer15());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer16(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer16());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer17(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer17());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer18(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer18());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer19(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer19());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer20(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer20());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer21(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer21());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer22(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer22());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer23(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer23());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer24(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer24());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer25(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer25());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer26(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer26());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer27(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer27());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer28(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer28());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer29(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer29());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer30(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phaseAnswer30());
        return unmanagedObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ActivityPhase2Db = [");
        stringBuilder.append("{mother:");
        stringBuilder.append(realmGet$mother() != null ? "Mother" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer1:");
        stringBuilder.append(realmGet$phaseAnswer1() != null ? realmGet$phaseAnswer1() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer2:");
        stringBuilder.append(realmGet$phaseAnswer2() != null ? realmGet$phaseAnswer2() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer3:");
        stringBuilder.append(realmGet$phaseAnswer3() != null ? realmGet$phaseAnswer3() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer4:");
        stringBuilder.append(realmGet$phaseAnswer4() != null ? realmGet$phaseAnswer4() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer5:");
        stringBuilder.append(realmGet$phaseAnswer5() != null ? realmGet$phaseAnswer5() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer6:");
        stringBuilder.append(realmGet$phaseAnswer6() != null ? realmGet$phaseAnswer6() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer7:");
        stringBuilder.append(realmGet$phaseAnswer7() != null ? realmGet$phaseAnswer7() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer8:");
        stringBuilder.append(realmGet$phaseAnswer8() != null ? realmGet$phaseAnswer8() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer9:");
        stringBuilder.append(realmGet$phaseAnswer9() != null ? realmGet$phaseAnswer9() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer10:");
        stringBuilder.append(realmGet$phaseAnswer10() != null ? realmGet$phaseAnswer10() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer11:");
        stringBuilder.append(realmGet$phaseAnswer11() != null ? realmGet$phaseAnswer11() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer12:");
        stringBuilder.append(realmGet$phaseAnswer12() != null ? realmGet$phaseAnswer12() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer13:");
        stringBuilder.append(realmGet$phaseAnswer13() != null ? realmGet$phaseAnswer13() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer14:");
        stringBuilder.append(realmGet$phaseAnswer14() != null ? realmGet$phaseAnswer14() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer15:");
        stringBuilder.append(realmGet$phaseAnswer15() != null ? realmGet$phaseAnswer15() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer16:");
        stringBuilder.append(realmGet$phaseAnswer16() != null ? realmGet$phaseAnswer16() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer17:");
        stringBuilder.append(realmGet$phaseAnswer17() != null ? realmGet$phaseAnswer17() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer18:");
        stringBuilder.append(realmGet$phaseAnswer18() != null ? realmGet$phaseAnswer18() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer19:");
        stringBuilder.append(realmGet$phaseAnswer19() != null ? realmGet$phaseAnswer19() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer20:");
        stringBuilder.append(realmGet$phaseAnswer20() != null ? realmGet$phaseAnswer20() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer21:");
        stringBuilder.append(realmGet$phaseAnswer21() != null ? realmGet$phaseAnswer21() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer22:");
        stringBuilder.append(realmGet$phaseAnswer22() != null ? realmGet$phaseAnswer22() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer23:");
        stringBuilder.append(realmGet$phaseAnswer23() != null ? realmGet$phaseAnswer23() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer24:");
        stringBuilder.append(realmGet$phaseAnswer24() != null ? realmGet$phaseAnswer24() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer25:");
        stringBuilder.append(realmGet$phaseAnswer25() != null ? realmGet$phaseAnswer25() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer26:");
        stringBuilder.append(realmGet$phaseAnswer26() != null ? realmGet$phaseAnswer26() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer27:");
        stringBuilder.append(realmGet$phaseAnswer27() != null ? realmGet$phaseAnswer27() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer28:");
        stringBuilder.append(realmGet$phaseAnswer28() != null ? realmGet$phaseAnswer28() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer29:");
        stringBuilder.append(realmGet$phaseAnswer29() != null ? realmGet$phaseAnswer29() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phaseAnswer30:");
        stringBuilder.append(realmGet$phaseAnswer30() != null ? realmGet$phaseAnswer30() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityPhase2DbRealmProxy aActivityPhase2Db = (ActivityPhase2DbRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aActivityPhase2Db.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aActivityPhase2Db.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aActivityPhase2Db.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
