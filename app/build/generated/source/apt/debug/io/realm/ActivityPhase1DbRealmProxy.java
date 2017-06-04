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

public class ActivityPhase1DbRealmProxy extends mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db
    implements RealmObjectProxy, ActivityPhase1DbRealmProxyInterface {

    static final class ActivityPhase1DbColumnInfo extends ColumnInfo
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

        ActivityPhase1DbColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(20);
            this.motherIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "mother");
            indicesMap.put("mother", this.motherIndex);
            this.phaseAnswer1Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer1");
            indicesMap.put("phaseAnswer1", this.phaseAnswer1Index);
            this.phaseAnswer2Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer2");
            indicesMap.put("phaseAnswer2", this.phaseAnswer2Index);
            this.phaseAnswer3Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer3");
            indicesMap.put("phaseAnswer3", this.phaseAnswer3Index);
            this.phaseAnswer4Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer4");
            indicesMap.put("phaseAnswer4", this.phaseAnswer4Index);
            this.phaseAnswer5Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer5");
            indicesMap.put("phaseAnswer5", this.phaseAnswer5Index);
            this.phaseAnswer6Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer6");
            indicesMap.put("phaseAnswer6", this.phaseAnswer6Index);
            this.phaseAnswer7Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer7");
            indicesMap.put("phaseAnswer7", this.phaseAnswer7Index);
            this.phaseAnswer8Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer8");
            indicesMap.put("phaseAnswer8", this.phaseAnswer8Index);
            this.phaseAnswer9Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer9");
            indicesMap.put("phaseAnswer9", this.phaseAnswer9Index);
            this.phaseAnswer10Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer10");
            indicesMap.put("phaseAnswer10", this.phaseAnswer10Index);
            this.phaseAnswer11Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer11");
            indicesMap.put("phaseAnswer11", this.phaseAnswer11Index);
            this.phaseAnswer12Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer12");
            indicesMap.put("phaseAnswer12", this.phaseAnswer12Index);
            this.phaseAnswer13Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer13");
            indicesMap.put("phaseAnswer13", this.phaseAnswer13Index);
            this.phaseAnswer14Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer14");
            indicesMap.put("phaseAnswer14", this.phaseAnswer14Index);
            this.phaseAnswer15Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer15");
            indicesMap.put("phaseAnswer15", this.phaseAnswer15Index);
            this.phaseAnswer16Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer16");
            indicesMap.put("phaseAnswer16", this.phaseAnswer16Index);
            this.phaseAnswer17Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer17");
            indicesMap.put("phaseAnswer17", this.phaseAnswer17Index);
            this.phaseAnswer18Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer18");
            indicesMap.put("phaseAnswer18", this.phaseAnswer18Index);
            this.phaseAnswer19Index = getValidColumnIndex(path, table, "ActivityPhase1Db", "phaseAnswer19");
            indicesMap.put("phaseAnswer19", this.phaseAnswer19Index);

            setIndicesMap(indicesMap);
        }

        @Override
        public final void copyColumnInfoFrom(ColumnInfo other) {
            final ActivityPhase1DbColumnInfo otherInfo = (ActivityPhase1DbColumnInfo) other;
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

            setIndicesMap(otherInfo.getIndicesMap());
        }

        @Override
        public final ActivityPhase1DbColumnInfo clone() {
            return (ActivityPhase1DbColumnInfo) super.clone();
        }

    }
    private ActivityPhase1DbColumnInfo columnInfo;
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
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ActivityPhase1DbRealmProxy() {
        if (proxyState == null) {
            injectObjectContext();
        }
        proxyState.setConstructionFinished();
    }

    private void injectObjectContext() {
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ActivityPhase1DbColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class, this);
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

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("ActivityPhase1Db")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("ActivityPhase1Db");
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
            return realmObjectSchema;
        }
        return realmSchema.get("ActivityPhase1Db");
    }

    public static Table initTable(SharedRealm sharedRealm) {
        if (!sharedRealm.hasTable("class_ActivityPhase1Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase1Db");
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
            table.setPrimaryKey("");
            return table;
        }
        return sharedRealm.getTable("class_ActivityPhase1Db");
    }

    public static ActivityPhase1DbColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (sharedRealm.hasTable("class_ActivityPhase1Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase1Db");
            final long columnCount = table.getColumnCount();
            if (columnCount != 20) {
                if (columnCount < 20) {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 20 but was " + columnCount);
                }
                if (allowExtraColumns) {
                    RealmLog.debug("Field count is more than expected - expected 20 but was %1$d", columnCount);
                } else {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 20 but was " + columnCount);
                }
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < columnCount; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final ActivityPhase1DbColumnInfo columnInfo = new ActivityPhase1DbColumnInfo(sharedRealm.getPath(), table);

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
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'ActivityPhase1Db' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_ActivityPhase1Db";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("mother")) {
            excludeFields.add("mother");
        }
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db obj = realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class, true, excludeFields);
        if (json.has("mother")) {
            if (json.isNull("mother")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$mother(null);
            } else {
                mic.unlimited.com.reportingapp.Database.Mother motherObj = MotherRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("mother"), update);
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$mother(motherObj);
            }
        }
        if (json.has("phaseAnswer1")) {
            if (json.isNull("phaseAnswer1")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer1(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer1((String) json.getString("phaseAnswer1"));
            }
        }
        if (json.has("phaseAnswer2")) {
            if (json.isNull("phaseAnswer2")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer2(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer2((String) json.getString("phaseAnswer2"));
            }
        }
        if (json.has("phaseAnswer3")) {
            if (json.isNull("phaseAnswer3")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer3(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer3((String) json.getString("phaseAnswer3"));
            }
        }
        if (json.has("phaseAnswer4")) {
            if (json.isNull("phaseAnswer4")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer4(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer4((String) json.getString("phaseAnswer4"));
            }
        }
        if (json.has("phaseAnswer5")) {
            if (json.isNull("phaseAnswer5")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer5(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer5((String) json.getString("phaseAnswer5"));
            }
        }
        if (json.has("phaseAnswer6")) {
            if (json.isNull("phaseAnswer6")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer6(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer6((String) json.getString("phaseAnswer6"));
            }
        }
        if (json.has("phaseAnswer7")) {
            if (json.isNull("phaseAnswer7")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer7(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer7((String) json.getString("phaseAnswer7"));
            }
        }
        if (json.has("phaseAnswer8")) {
            if (json.isNull("phaseAnswer8")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer8(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer8((String) json.getString("phaseAnswer8"));
            }
        }
        if (json.has("phaseAnswer9")) {
            if (json.isNull("phaseAnswer9")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer9(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer9((String) json.getString("phaseAnswer9"));
            }
        }
        if (json.has("phaseAnswer10")) {
            if (json.isNull("phaseAnswer10")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer10(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer10((String) json.getString("phaseAnswer10"));
            }
        }
        if (json.has("phaseAnswer11")) {
            if (json.isNull("phaseAnswer11")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer11(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer11((String) json.getString("phaseAnswer11"));
            }
        }
        if (json.has("phaseAnswer12")) {
            if (json.isNull("phaseAnswer12")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer12(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer12((String) json.getString("phaseAnswer12"));
            }
        }
        if (json.has("phaseAnswer13")) {
            if (json.isNull("phaseAnswer13")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer13(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer13((String) json.getString("phaseAnswer13"));
            }
        }
        if (json.has("phaseAnswer14")) {
            if (json.isNull("phaseAnswer14")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer14(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer14((String) json.getString("phaseAnswer14"));
            }
        }
        if (json.has("phaseAnswer15")) {
            if (json.isNull("phaseAnswer15")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer15(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer15((String) json.getString("phaseAnswer15"));
            }
        }
        if (json.has("phaseAnswer16")) {
            if (json.isNull("phaseAnswer16")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer16(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer16((String) json.getString("phaseAnswer16"));
            }
        }
        if (json.has("phaseAnswer17")) {
            if (json.isNull("phaseAnswer17")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer17(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer17((String) json.getString("phaseAnswer17"));
            }
        }
        if (json.has("phaseAnswer18")) {
            if (json.isNull("phaseAnswer18")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer18(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer18((String) json.getString("phaseAnswer18"));
            }
        }
        if (json.has("phaseAnswer19")) {
            if (json.isNull("phaseAnswer19")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer19(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer19((String) json.getString("phaseAnswer19"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db obj = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("mother")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$mother(null);
                } else {
                    mic.unlimited.com.reportingapp.Database.Mother motherObj = MotherRealmProxy.createUsingJsonStream(realm, reader);
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$mother(motherObj);
                }
            } else if (name.equals("phaseAnswer1")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer1(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer1((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer2")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer2(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer2((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer3")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer3(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer3((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer4")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer4(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer4((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer5")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer5(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer5((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer6")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer6(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer6((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer7")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer7(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer7((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer8")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer8(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer8((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer9")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer9(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer9((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer10")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer10(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer10((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer11")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer11(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer11((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer12")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer12(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer12((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer13")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer13(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer13((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer14")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer14(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer14((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer15")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer15(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer15((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer16")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer16(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer16((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer17")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer17(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer17((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer18")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer18(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer18((String) reader.nextString());
                }
            } else if (name.equals("phaseAnswer19")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer19(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phaseAnswer19((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db copyOrUpdate(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) cachedRealmObject;
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db copy(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db realmObject = realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class, false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);

            mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$mother();
            if (motherObj != null) {
                mic.unlimited.com.reportingapp.Database.Mother cachemother = (mic.unlimited.com.reportingapp.Database.Mother) cache.get(motherObj);
                if (cachemother != null) {
                    ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$mother(cachemother);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$mother(MotherRealmProxy.copyOrUpdate(realm, motherObj, update, cache));
                }
            } else {
                ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$mother(null);
            }
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer1(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer1());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer2(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer2());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer3(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer3());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer4(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer4());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer5(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer5());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer6(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer6());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer7(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer7());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer8(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer8());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer9(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer9());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer10(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer10());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer11(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer11());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer12(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer12());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer13(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer13());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer14(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer14());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer15(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer15());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer16(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer16());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer17(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer17());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer18(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer18());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phaseAnswer19(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phaseAnswer19());
            return realmObject;
        }
    }

    public static long insert(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase1DbColumnInfo columnInfo = (ActivityPhase1DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
        cache.put(object, rowIndex);

        mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase1DbRealmProxyInterface) object).realmGet$mother();
        if (motherObj != null) {
            Long cachemother = cache.get(motherObj);
            if (cachemother == null) {
                cachemother = MotherRealmProxy.insert(realm, motherObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.motherIndex, rowIndex, cachemother, false);
        }
        String realmGet$phaseAnswer1 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer1();
        if (realmGet$phaseAnswer1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, realmGet$phaseAnswer1, false);
        }
        String realmGet$phaseAnswer2 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer2();
        if (realmGet$phaseAnswer2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, realmGet$phaseAnswer2, false);
        }
        String realmGet$phaseAnswer3 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer3();
        if (realmGet$phaseAnswer3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, realmGet$phaseAnswer3, false);
        }
        String realmGet$phaseAnswer4 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer4();
        if (realmGet$phaseAnswer4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, realmGet$phaseAnswer4, false);
        }
        String realmGet$phaseAnswer5 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer5();
        if (realmGet$phaseAnswer5 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, realmGet$phaseAnswer5, false);
        }
        String realmGet$phaseAnswer6 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer6();
        if (realmGet$phaseAnswer6 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, realmGet$phaseAnswer6, false);
        }
        String realmGet$phaseAnswer7 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer7();
        if (realmGet$phaseAnswer7 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, realmGet$phaseAnswer7, false);
        }
        String realmGet$phaseAnswer8 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer8();
        if (realmGet$phaseAnswer8 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, realmGet$phaseAnswer8, false);
        }
        String realmGet$phaseAnswer9 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer9();
        if (realmGet$phaseAnswer9 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, realmGet$phaseAnswer9, false);
        }
        String realmGet$phaseAnswer10 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer10();
        if (realmGet$phaseAnswer10 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, realmGet$phaseAnswer10, false);
        }
        String realmGet$phaseAnswer11 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer11();
        if (realmGet$phaseAnswer11 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, realmGet$phaseAnswer11, false);
        }
        String realmGet$phaseAnswer12 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer12();
        if (realmGet$phaseAnswer12 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, realmGet$phaseAnswer12, false);
        }
        String realmGet$phaseAnswer13 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer13();
        if (realmGet$phaseAnswer13 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, realmGet$phaseAnswer13, false);
        }
        String realmGet$phaseAnswer14 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer14();
        if (realmGet$phaseAnswer14 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, realmGet$phaseAnswer14, false);
        }
        String realmGet$phaseAnswer15 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer15();
        if (realmGet$phaseAnswer15 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, realmGet$phaseAnswer15, false);
        }
        String realmGet$phaseAnswer16 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer16();
        if (realmGet$phaseAnswer16 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, realmGet$phaseAnswer16, false);
        }
        String realmGet$phaseAnswer17 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer17();
        if (realmGet$phaseAnswer17 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, realmGet$phaseAnswer17, false);
        }
        String realmGet$phaseAnswer18 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer18();
        if (realmGet$phaseAnswer18 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, realmGet$phaseAnswer18, false);
        }
        String realmGet$phaseAnswer19 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer19();
        if (realmGet$phaseAnswer19 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, realmGet$phaseAnswer19, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase1DbColumnInfo columnInfo = (ActivityPhase1DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                cache.put(object, rowIndex);

                mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase1DbRealmProxyInterface) object).realmGet$mother();
                if (motherObj != null) {
                    Long cachemother = cache.get(motherObj);
                    if (cachemother == null) {
                        cachemother = MotherRealmProxy.insert(realm, motherObj, cache);
                    }
                    table.setLink(columnInfo.motherIndex, rowIndex, cachemother, false);
                }
                String realmGet$phaseAnswer1 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer1();
                if (realmGet$phaseAnswer1 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, realmGet$phaseAnswer1, false);
                }
                String realmGet$phaseAnswer2 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer2();
                if (realmGet$phaseAnswer2 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, realmGet$phaseAnswer2, false);
                }
                String realmGet$phaseAnswer3 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer3();
                if (realmGet$phaseAnswer3 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, realmGet$phaseAnswer3, false);
                }
                String realmGet$phaseAnswer4 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer4();
                if (realmGet$phaseAnswer4 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, realmGet$phaseAnswer4, false);
                }
                String realmGet$phaseAnswer5 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer5();
                if (realmGet$phaseAnswer5 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, realmGet$phaseAnswer5, false);
                }
                String realmGet$phaseAnswer6 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer6();
                if (realmGet$phaseAnswer6 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, realmGet$phaseAnswer6, false);
                }
                String realmGet$phaseAnswer7 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer7();
                if (realmGet$phaseAnswer7 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, realmGet$phaseAnswer7, false);
                }
                String realmGet$phaseAnswer8 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer8();
                if (realmGet$phaseAnswer8 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, realmGet$phaseAnswer8, false);
                }
                String realmGet$phaseAnswer9 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer9();
                if (realmGet$phaseAnswer9 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, realmGet$phaseAnswer9, false);
                }
                String realmGet$phaseAnswer10 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer10();
                if (realmGet$phaseAnswer10 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, realmGet$phaseAnswer10, false);
                }
                String realmGet$phaseAnswer11 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer11();
                if (realmGet$phaseAnswer11 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, realmGet$phaseAnswer11, false);
                }
                String realmGet$phaseAnswer12 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer12();
                if (realmGet$phaseAnswer12 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, realmGet$phaseAnswer12, false);
                }
                String realmGet$phaseAnswer13 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer13();
                if (realmGet$phaseAnswer13 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, realmGet$phaseAnswer13, false);
                }
                String realmGet$phaseAnswer14 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer14();
                if (realmGet$phaseAnswer14 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, realmGet$phaseAnswer14, false);
                }
                String realmGet$phaseAnswer15 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer15();
                if (realmGet$phaseAnswer15 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, realmGet$phaseAnswer15, false);
                }
                String realmGet$phaseAnswer16 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer16();
                if (realmGet$phaseAnswer16 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, realmGet$phaseAnswer16, false);
                }
                String realmGet$phaseAnswer17 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer17();
                if (realmGet$phaseAnswer17 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, realmGet$phaseAnswer17, false);
                }
                String realmGet$phaseAnswer18 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer18();
                if (realmGet$phaseAnswer18 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, realmGet$phaseAnswer18, false);
                }
                String realmGet$phaseAnswer19 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer19();
                if (realmGet$phaseAnswer19 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, realmGet$phaseAnswer19, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase1DbColumnInfo columnInfo = (ActivityPhase1DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
        cache.put(object, rowIndex);

        mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase1DbRealmProxyInterface) object).realmGet$mother();
        if (motherObj != null) {
            Long cachemother = cache.get(motherObj);
            if (cachemother == null) {
                cachemother = MotherRealmProxy.insertOrUpdate(realm, motherObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.motherIndex, rowIndex, cachemother, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.motherIndex, rowIndex);
        }
        String realmGet$phaseAnswer1 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer1();
        if (realmGet$phaseAnswer1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, realmGet$phaseAnswer1, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, false);
        }
        String realmGet$phaseAnswer2 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer2();
        if (realmGet$phaseAnswer2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, realmGet$phaseAnswer2, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, false);
        }
        String realmGet$phaseAnswer3 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer3();
        if (realmGet$phaseAnswer3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, realmGet$phaseAnswer3, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, false);
        }
        String realmGet$phaseAnswer4 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer4();
        if (realmGet$phaseAnswer4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, realmGet$phaseAnswer4, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, false);
        }
        String realmGet$phaseAnswer5 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer5();
        if (realmGet$phaseAnswer5 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, realmGet$phaseAnswer5, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, false);
        }
        String realmGet$phaseAnswer6 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer6();
        if (realmGet$phaseAnswer6 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, realmGet$phaseAnswer6, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, false);
        }
        String realmGet$phaseAnswer7 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer7();
        if (realmGet$phaseAnswer7 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, realmGet$phaseAnswer7, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, false);
        }
        String realmGet$phaseAnswer8 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer8();
        if (realmGet$phaseAnswer8 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, realmGet$phaseAnswer8, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, false);
        }
        String realmGet$phaseAnswer9 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer9();
        if (realmGet$phaseAnswer9 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, realmGet$phaseAnswer9, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, false);
        }
        String realmGet$phaseAnswer10 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer10();
        if (realmGet$phaseAnswer10 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, realmGet$phaseAnswer10, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, false);
        }
        String realmGet$phaseAnswer11 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer11();
        if (realmGet$phaseAnswer11 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, realmGet$phaseAnswer11, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, false);
        }
        String realmGet$phaseAnswer12 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer12();
        if (realmGet$phaseAnswer12 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, realmGet$phaseAnswer12, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, false);
        }
        String realmGet$phaseAnswer13 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer13();
        if (realmGet$phaseAnswer13 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, realmGet$phaseAnswer13, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, false);
        }
        String realmGet$phaseAnswer14 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer14();
        if (realmGet$phaseAnswer14 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, realmGet$phaseAnswer14, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, false);
        }
        String realmGet$phaseAnswer15 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer15();
        if (realmGet$phaseAnswer15 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, realmGet$phaseAnswer15, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, false);
        }
        String realmGet$phaseAnswer16 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer16();
        if (realmGet$phaseAnswer16 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, realmGet$phaseAnswer16, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, false);
        }
        String realmGet$phaseAnswer17 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer17();
        if (realmGet$phaseAnswer17 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, realmGet$phaseAnswer17, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, false);
        }
        String realmGet$phaseAnswer18 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer18();
        if (realmGet$phaseAnswer18 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, realmGet$phaseAnswer18, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, false);
        }
        String realmGet$phaseAnswer19 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer19();
        if (realmGet$phaseAnswer19 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, realmGet$phaseAnswer19, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase1DbColumnInfo columnInfo = (ActivityPhase1DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                cache.put(object, rowIndex);

                mic.unlimited.com.reportingapp.Database.Mother motherObj = ((ActivityPhase1DbRealmProxyInterface) object).realmGet$mother();
                if (motherObj != null) {
                    Long cachemother = cache.get(motherObj);
                    if (cachemother == null) {
                        cachemother = MotherRealmProxy.insertOrUpdate(realm, motherObj, cache);
                    }
                    Table.nativeSetLink(tableNativePtr, columnInfo.motherIndex, rowIndex, cachemother, false);
                } else {
                    Table.nativeNullifyLink(tableNativePtr, columnInfo.motherIndex, rowIndex);
                }
                String realmGet$phaseAnswer1 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer1();
                if (realmGet$phaseAnswer1 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, realmGet$phaseAnswer1, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer1Index, rowIndex, false);
                }
                String realmGet$phaseAnswer2 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer2();
                if (realmGet$phaseAnswer2 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, realmGet$phaseAnswer2, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer2Index, rowIndex, false);
                }
                String realmGet$phaseAnswer3 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer3();
                if (realmGet$phaseAnswer3 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, realmGet$phaseAnswer3, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer3Index, rowIndex, false);
                }
                String realmGet$phaseAnswer4 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer4();
                if (realmGet$phaseAnswer4 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, realmGet$phaseAnswer4, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer4Index, rowIndex, false);
                }
                String realmGet$phaseAnswer5 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer5();
                if (realmGet$phaseAnswer5 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, realmGet$phaseAnswer5, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer5Index, rowIndex, false);
                }
                String realmGet$phaseAnswer6 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer6();
                if (realmGet$phaseAnswer6 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, realmGet$phaseAnswer6, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer6Index, rowIndex, false);
                }
                String realmGet$phaseAnswer7 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer7();
                if (realmGet$phaseAnswer7 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, realmGet$phaseAnswer7, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer7Index, rowIndex, false);
                }
                String realmGet$phaseAnswer8 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer8();
                if (realmGet$phaseAnswer8 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, realmGet$phaseAnswer8, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer8Index, rowIndex, false);
                }
                String realmGet$phaseAnswer9 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer9();
                if (realmGet$phaseAnswer9 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, realmGet$phaseAnswer9, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer9Index, rowIndex, false);
                }
                String realmGet$phaseAnswer10 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer10();
                if (realmGet$phaseAnswer10 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, realmGet$phaseAnswer10, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer10Index, rowIndex, false);
                }
                String realmGet$phaseAnswer11 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer11();
                if (realmGet$phaseAnswer11 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, realmGet$phaseAnswer11, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer11Index, rowIndex, false);
                }
                String realmGet$phaseAnswer12 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer12();
                if (realmGet$phaseAnswer12 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, realmGet$phaseAnswer12, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer12Index, rowIndex, false);
                }
                String realmGet$phaseAnswer13 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer13();
                if (realmGet$phaseAnswer13 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, realmGet$phaseAnswer13, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer13Index, rowIndex, false);
                }
                String realmGet$phaseAnswer14 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer14();
                if (realmGet$phaseAnswer14 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, realmGet$phaseAnswer14, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer14Index, rowIndex, false);
                }
                String realmGet$phaseAnswer15 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer15();
                if (realmGet$phaseAnswer15 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, realmGet$phaseAnswer15, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer15Index, rowIndex, false);
                }
                String realmGet$phaseAnswer16 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer16();
                if (realmGet$phaseAnswer16 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, realmGet$phaseAnswer16, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer16Index, rowIndex, false);
                }
                String realmGet$phaseAnswer17 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer17();
                if (realmGet$phaseAnswer17 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, realmGet$phaseAnswer17, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer17Index, rowIndex, false);
                }
                String realmGet$phaseAnswer18 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer18();
                if (realmGet$phaseAnswer18 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, realmGet$phaseAnswer18, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer18Index, rowIndex, false);
                }
                String realmGet$phaseAnswer19 = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phaseAnswer19();
                if (realmGet$phaseAnswer19 != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, realmGet$phaseAnswer19, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phaseAnswer19Index, rowIndex, false);
                }
            }
        }
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db createDetachedCopy(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db)cachedObject.object;
            } else {
                unmanagedObject = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }

        // Deep copy of mother
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$mother(MotherRealmProxy.createDetachedCopy(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$mother(), currentDepth + 1, maxDepth, cache));
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer1(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer1());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer2(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer2());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer3(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer3());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer4(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer4());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer5(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer5());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer6(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer6());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer7(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer7());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer8(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer8());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer9(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer9());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer10(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer10());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer11(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer11());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer12(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer12());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer13(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer13());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer14(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer14());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer15(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer15());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer16(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer16());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer17(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer17());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer18(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer18());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phaseAnswer19(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phaseAnswer19());
        return unmanagedObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ActivityPhase1Db = [");
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
        ActivityPhase1DbRealmProxy aActivityPhase1Db = (ActivityPhase1DbRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aActivityPhase1Db.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aActivityPhase1Db.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aActivityPhase1Db.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
