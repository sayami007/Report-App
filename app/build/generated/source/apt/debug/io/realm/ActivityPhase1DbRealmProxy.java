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

        public long phase1IdIndex;
        public long phase1SupervisorIndex;
        public long phase1DistrictIndex;
        public long phase1DateIndex;
        public long phase1MotherIndex;
        public long phase1MotherAgeIndex;
        public long phase1MotherContactIndex;
        public long phase1MotherAddressIndex;
        public long phase1Answer1DbIndex;
        public long phase1Answer2DbIndex;
        public long phase1Answer3DbIndex;
        public long phase1Answer4DbIndex;
        public long phase1Answer5DbIndex;
        public long phase1Answer6DbIndex;
        public long phase1Answer7DbIndex;
        public long phase1Answer8DbIndex;
        public long phase1Answer9DbIndex;
        public long phase1Answer10DbIndex;
        public long phase1Answer11DbIndex;
        public long phase1Answer12DbIndex;
        public long phase1Answer13DbIndex;
        public long phase1Answer14DbIndex;
        public long phase1Answer15DbIndex;
        public long phase1Answer16DbIndex;
        public long phase1Answer17DbIndex;
        public long phase1Answer18DbIndex;
        public long phase1Answer19DbIndex;

        ActivityPhase1DbColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(27);
            this.phase1IdIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Id");
            indicesMap.put("phase1Id", this.phase1IdIndex);
            this.phase1SupervisorIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Supervisor");
            indicesMap.put("phase1Supervisor", this.phase1SupervisorIndex);
            this.phase1DistrictIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1District");
            indicesMap.put("phase1District", this.phase1DistrictIndex);
            this.phase1DateIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Date");
            indicesMap.put("phase1Date", this.phase1DateIndex);
            this.phase1MotherIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Mother");
            indicesMap.put("phase1Mother", this.phase1MotherIndex);
            this.phase1MotherAgeIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1MotherAge");
            indicesMap.put("phase1MotherAge", this.phase1MotherAgeIndex);
            this.phase1MotherContactIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1MotherContact");
            indicesMap.put("phase1MotherContact", this.phase1MotherContactIndex);
            this.phase1MotherAddressIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1MotherAddress");
            indicesMap.put("phase1MotherAddress", this.phase1MotherAddressIndex);
            this.phase1Answer1DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer1Db");
            indicesMap.put("phase1Answer1Db", this.phase1Answer1DbIndex);
            this.phase1Answer2DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer2Db");
            indicesMap.put("phase1Answer2Db", this.phase1Answer2DbIndex);
            this.phase1Answer3DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer3Db");
            indicesMap.put("phase1Answer3Db", this.phase1Answer3DbIndex);
            this.phase1Answer4DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer4Db");
            indicesMap.put("phase1Answer4Db", this.phase1Answer4DbIndex);
            this.phase1Answer5DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer5Db");
            indicesMap.put("phase1Answer5Db", this.phase1Answer5DbIndex);
            this.phase1Answer6DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer6Db");
            indicesMap.put("phase1Answer6Db", this.phase1Answer6DbIndex);
            this.phase1Answer7DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer7Db");
            indicesMap.put("phase1Answer7Db", this.phase1Answer7DbIndex);
            this.phase1Answer8DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer8Db");
            indicesMap.put("phase1Answer8Db", this.phase1Answer8DbIndex);
            this.phase1Answer9DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer9Db");
            indicesMap.put("phase1Answer9Db", this.phase1Answer9DbIndex);
            this.phase1Answer10DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer10Db");
            indicesMap.put("phase1Answer10Db", this.phase1Answer10DbIndex);
            this.phase1Answer11DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer11Db");
            indicesMap.put("phase1Answer11Db", this.phase1Answer11DbIndex);
            this.phase1Answer12DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer12Db");
            indicesMap.put("phase1Answer12Db", this.phase1Answer12DbIndex);
            this.phase1Answer13DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer13Db");
            indicesMap.put("phase1Answer13Db", this.phase1Answer13DbIndex);
            this.phase1Answer14DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer14Db");
            indicesMap.put("phase1Answer14Db", this.phase1Answer14DbIndex);
            this.phase1Answer15DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer15Db");
            indicesMap.put("phase1Answer15Db", this.phase1Answer15DbIndex);
            this.phase1Answer16DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer16Db");
            indicesMap.put("phase1Answer16Db", this.phase1Answer16DbIndex);
            this.phase1Answer17DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer17Db");
            indicesMap.put("phase1Answer17Db", this.phase1Answer17DbIndex);
            this.phase1Answer18DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer18Db");
            indicesMap.put("phase1Answer18Db", this.phase1Answer18DbIndex);
            this.phase1Answer19DbIndex = getValidColumnIndex(path, table, "ActivityPhase1Db", "phase1Answer19Db");
            indicesMap.put("phase1Answer19Db", this.phase1Answer19DbIndex);

            setIndicesMap(indicesMap);
        }

        @Override
        public final void copyColumnInfoFrom(ColumnInfo other) {
            final ActivityPhase1DbColumnInfo otherInfo = (ActivityPhase1DbColumnInfo) other;
            this.phase1IdIndex = otherInfo.phase1IdIndex;
            this.phase1SupervisorIndex = otherInfo.phase1SupervisorIndex;
            this.phase1DistrictIndex = otherInfo.phase1DistrictIndex;
            this.phase1DateIndex = otherInfo.phase1DateIndex;
            this.phase1MotherIndex = otherInfo.phase1MotherIndex;
            this.phase1MotherAgeIndex = otherInfo.phase1MotherAgeIndex;
            this.phase1MotherContactIndex = otherInfo.phase1MotherContactIndex;
            this.phase1MotherAddressIndex = otherInfo.phase1MotherAddressIndex;
            this.phase1Answer1DbIndex = otherInfo.phase1Answer1DbIndex;
            this.phase1Answer2DbIndex = otherInfo.phase1Answer2DbIndex;
            this.phase1Answer3DbIndex = otherInfo.phase1Answer3DbIndex;
            this.phase1Answer4DbIndex = otherInfo.phase1Answer4DbIndex;
            this.phase1Answer5DbIndex = otherInfo.phase1Answer5DbIndex;
            this.phase1Answer6DbIndex = otherInfo.phase1Answer6DbIndex;
            this.phase1Answer7DbIndex = otherInfo.phase1Answer7DbIndex;
            this.phase1Answer8DbIndex = otherInfo.phase1Answer8DbIndex;
            this.phase1Answer9DbIndex = otherInfo.phase1Answer9DbIndex;
            this.phase1Answer10DbIndex = otherInfo.phase1Answer10DbIndex;
            this.phase1Answer11DbIndex = otherInfo.phase1Answer11DbIndex;
            this.phase1Answer12DbIndex = otherInfo.phase1Answer12DbIndex;
            this.phase1Answer13DbIndex = otherInfo.phase1Answer13DbIndex;
            this.phase1Answer14DbIndex = otherInfo.phase1Answer14DbIndex;
            this.phase1Answer15DbIndex = otherInfo.phase1Answer15DbIndex;
            this.phase1Answer16DbIndex = otherInfo.phase1Answer16DbIndex;
            this.phase1Answer17DbIndex = otherInfo.phase1Answer17DbIndex;
            this.phase1Answer18DbIndex = otherInfo.phase1Answer18DbIndex;
            this.phase1Answer19DbIndex = otherInfo.phase1Answer19DbIndex;

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
        fieldNames.add("phase1Id");
        fieldNames.add("phase1Supervisor");
        fieldNames.add("phase1District");
        fieldNames.add("phase1Date");
        fieldNames.add("phase1Mother");
        fieldNames.add("phase1MotherAge");
        fieldNames.add("phase1MotherContact");
        fieldNames.add("phase1MotherAddress");
        fieldNames.add("phase1Answer1Db");
        fieldNames.add("phase1Answer2Db");
        fieldNames.add("phase1Answer3Db");
        fieldNames.add("phase1Answer4Db");
        fieldNames.add("phase1Answer5Db");
        fieldNames.add("phase1Answer6Db");
        fieldNames.add("phase1Answer7Db");
        fieldNames.add("phase1Answer8Db");
        fieldNames.add("phase1Answer9Db");
        fieldNames.add("phase1Answer10Db");
        fieldNames.add("phase1Answer11Db");
        fieldNames.add("phase1Answer12Db");
        fieldNames.add("phase1Answer13Db");
        fieldNames.add("phase1Answer14Db");
        fieldNames.add("phase1Answer15Db");
        fieldNames.add("phase1Answer16Db");
        fieldNames.add("phase1Answer17Db");
        fieldNames.add("phase1Answer18Db");
        fieldNames.add("phase1Answer19Db");
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

    @SuppressWarnings("cast")
    public int realmGet$phase1Id() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.phase1IdIndex);
    }

    public void realmSet$phase1Id(int value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'phase1Id' cannot be changed after object was created.");
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Supervisor() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1SupervisorIndex);
    }

    public void realmSet$phase1Supervisor(String value) {
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
                row.getTable().setNull(columnInfo.phase1SupervisorIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1SupervisorIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1SupervisorIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1SupervisorIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1District() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1DistrictIndex);
    }

    public void realmSet$phase1District(String value) {
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
                row.getTable().setNull(columnInfo.phase1DistrictIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1DistrictIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1DistrictIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1DistrictIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Date() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1DateIndex);
    }

    public void realmSet$phase1Date(String value) {
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
                row.getTable().setNull(columnInfo.phase1DateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1DateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1DateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1DateIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Mother() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1MotherIndex);
    }

    public void realmSet$phase1Mother(String value) {
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
                row.getTable().setNull(columnInfo.phase1MotherIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1MotherIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1MotherIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1MotherIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1MotherAge() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1MotherAgeIndex);
    }

    public void realmSet$phase1MotherAge(String value) {
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
                row.getTable().setNull(columnInfo.phase1MotherAgeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1MotherAgeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1MotherAgeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1MotherAgeIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1MotherContact() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1MotherContactIndex);
    }

    public void realmSet$phase1MotherContact(String value) {
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
                row.getTable().setNull(columnInfo.phase1MotherContactIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1MotherContactIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1MotherContactIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1MotherContactIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1MotherAddress() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1MotherAddressIndex);
    }

    public void realmSet$phase1MotherAddress(String value) {
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
                row.getTable().setNull(columnInfo.phase1MotherAddressIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1MotherAddressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1MotherAddressIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1MotherAddressIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer1Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer1DbIndex);
    }

    public void realmSet$phase1Answer1Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer1DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer1DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer1DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer1DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer2Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer2DbIndex);
    }

    public void realmSet$phase1Answer2Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer2DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer2DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer2DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer2DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer3Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer3DbIndex);
    }

    public void realmSet$phase1Answer3Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer3DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer3DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer3DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer3DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer4Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer4DbIndex);
    }

    public void realmSet$phase1Answer4Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer4DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer4DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer4DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer4DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer5Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer5DbIndex);
    }

    public void realmSet$phase1Answer5Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer5DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer5DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer5DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer5DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer6Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer6DbIndex);
    }

    public void realmSet$phase1Answer6Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer6DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer6DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer6DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer6DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer7Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer7DbIndex);
    }

    public void realmSet$phase1Answer7Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer7DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer7DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer7DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer7DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer8Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer8DbIndex);
    }

    public void realmSet$phase1Answer8Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer8DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer8DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer8DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer8DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer9Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer9DbIndex);
    }

    public void realmSet$phase1Answer9Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer9DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer9DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer9DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer9DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer10Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer10DbIndex);
    }

    public void realmSet$phase1Answer10Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer10DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer10DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer10DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer10DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer11Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer11DbIndex);
    }

    public void realmSet$phase1Answer11Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer11DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer11DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer11DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer11DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer12Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer12DbIndex);
    }

    public void realmSet$phase1Answer12Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer12DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer12DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer12DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer12DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer13Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer13DbIndex);
    }

    public void realmSet$phase1Answer13Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer13DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer13DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer13DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer13DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer14Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer14DbIndex);
    }

    public void realmSet$phase1Answer14Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer14DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer14DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer14DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer14DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer15Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer15DbIndex);
    }

    public void realmSet$phase1Answer15Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer15DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer15DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer15DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer15DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer16Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer16DbIndex);
    }

    public void realmSet$phase1Answer16Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer16DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer16DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer16DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer16DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer17Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer17DbIndex);
    }

    public void realmSet$phase1Answer17Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer17DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer17DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer17DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer17DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer18Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer18DbIndex);
    }

    public void realmSet$phase1Answer18Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer18DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer18DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer18DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer18DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase1Answer19Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase1Answer19DbIndex);
    }

    public void realmSet$phase1Answer19Db(String value) {
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
                row.getTable().setNull(columnInfo.phase1Answer19DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase1Answer19DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase1Answer19DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase1Answer19DbIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("ActivityPhase1Db")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("ActivityPhase1Db");
            realmObjectSchema.add(new Property("phase1Id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Supervisor", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1District", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Mother", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1MotherAge", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1MotherContact", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1MotherAddress", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer1Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer2Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer3Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer4Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer5Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer6Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer7Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer8Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer9Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer10Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer11Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer12Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer13Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer14Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer15Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer16Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer17Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer18Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase1Answer19Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            return realmObjectSchema;
        }
        return realmSchema.get("ActivityPhase1Db");
    }

    public static Table initTable(SharedRealm sharedRealm) {
        if (!sharedRealm.hasTable("class_ActivityPhase1Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase1Db");
            table.addColumn(RealmFieldType.INTEGER, "phase1Id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Supervisor", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1District", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Date", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Mother", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1MotherAge", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1MotherContact", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1MotherAddress", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer1Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer2Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer3Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer4Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer5Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer6Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer7Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer8Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer9Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer10Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer11Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer12Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer13Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer14Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer15Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer16Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer17Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer18Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase1Answer19Db", Table.NULLABLE);
            table.addSearchIndex(table.getColumnIndex("phase1Id"));
            table.setPrimaryKey("phase1Id");
            return table;
        }
        return sharedRealm.getTable("class_ActivityPhase1Db");
    }

    public static ActivityPhase1DbColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (sharedRealm.hasTable("class_ActivityPhase1Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase1Db");
            final long columnCount = table.getColumnCount();
            if (columnCount != 27) {
                if (columnCount < 27) {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 27 but was " + columnCount);
                }
                if (allowExtraColumns) {
                    RealmLog.debug("Field count is more than expected - expected 27 but was %1$d", columnCount);
                } else {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 27 but was " + columnCount);
                }
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < columnCount; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final ActivityPhase1DbColumnInfo columnInfo = new ActivityPhase1DbColumnInfo(sharedRealm.getPath(), table);

            if (!columnTypes.containsKey("phase1Id")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Id") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'phase1Id' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.phase1IdIndex) && table.findFirstNull(columnInfo.phase1IdIndex) != TableOrView.NO_MATCH) {
                throw new IllegalStateException("Cannot migrate an object with null value in field 'phase1Id'. Either maintain the same type for primary key field 'phase1Id', or remove the object with null value before migration.");
            }
            if (table.getPrimaryKey() != table.getColumnIndex("phase1Id")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'phase1Id' in existing Realm file. Add @PrimaryKey.");
            }
            if (!table.hasSearchIndex(table.getColumnIndex("phase1Id"))) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'phase1Id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
            }
            if (!columnTypes.containsKey("phase1Supervisor")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Supervisor' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Supervisor") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Supervisor' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1SupervisorIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Supervisor' is required. Either set @Required to field 'phase1Supervisor' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1District")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1District' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1District") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1District' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1DistrictIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1District' is required. Either set @Required to field 'phase1District' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Date")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Date") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Date' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1DateIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Date' is required. Either set @Required to field 'phase1Date' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Mother")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Mother' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Mother") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Mother' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1MotherIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Mother' is required. Either set @Required to field 'phase1Mother' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1MotherAge")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1MotherAge' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1MotherAge") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1MotherAge' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1MotherAgeIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1MotherAge' is required. Either set @Required to field 'phase1MotherAge' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1MotherContact")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1MotherContact' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1MotherContact") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1MotherContact' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1MotherContactIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1MotherContact' is required. Either set @Required to field 'phase1MotherContact' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1MotherAddress")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1MotherAddress' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1MotherAddress") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1MotherAddress' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1MotherAddressIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1MotherAddress' is required. Either set @Required to field 'phase1MotherAddress' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer1Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer1Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer1Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer1Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer1DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer1Db' is required. Either set @Required to field 'phase1Answer1Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer2Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer2Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer2Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer2Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer2DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer2Db' is required. Either set @Required to field 'phase1Answer2Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer3Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer3Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer3Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer3Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer3DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer3Db' is required. Either set @Required to field 'phase1Answer3Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer4Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer4Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer4Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer4Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer4DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer4Db' is required. Either set @Required to field 'phase1Answer4Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer5Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer5Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer5Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer5Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer5DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer5Db' is required. Either set @Required to field 'phase1Answer5Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer6Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer6Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer6Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer6Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer6DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer6Db' is required. Either set @Required to field 'phase1Answer6Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer7Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer7Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer7Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer7Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer7DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer7Db' is required. Either set @Required to field 'phase1Answer7Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer8Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer8Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer8Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer8Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer8DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer8Db' is required. Either set @Required to field 'phase1Answer8Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer9Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer9Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer9Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer9Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer9DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer9Db' is required. Either set @Required to field 'phase1Answer9Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer10Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer10Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer10Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer10Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer10DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer10Db' is required. Either set @Required to field 'phase1Answer10Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer11Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer11Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer11Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer11Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer11DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer11Db' is required. Either set @Required to field 'phase1Answer11Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer12Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer12Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer12Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer12Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer12DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer12Db' is required. Either set @Required to field 'phase1Answer12Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer13Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer13Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer13Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer13Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer13DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer13Db' is required. Either set @Required to field 'phase1Answer13Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer14Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer14Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer14Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer14Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer14DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer14Db' is required. Either set @Required to field 'phase1Answer14Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer15Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer15Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer15Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer15Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer15DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer15Db' is required. Either set @Required to field 'phase1Answer15Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer16Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer16Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer16Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer16Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer16DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer16Db' is required. Either set @Required to field 'phase1Answer16Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer17Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer17Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer17Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer17Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer17DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer17Db' is required. Either set @Required to field 'phase1Answer17Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer18Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer18Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer18Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer18Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer18DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer18Db' is required. Either set @Required to field 'phase1Answer18Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase1Answer19Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase1Answer19Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase1Answer19Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase1Answer19Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase1Answer19DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase1Answer19Db' is required. Either set @Required to field 'phase1Answer19Db' or migrate using RealmObjectSchema.setNullable().");
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
        final List<String> excludeFields = Collections.<String> emptyList();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db obj = null;
        if (update) {
            Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("phase1Id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("phase1Id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ActivityPhase1DbRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("phase1Id")) {
                if (json.isNull("phase1Id")) {
                    obj = (io.realm.ActivityPhase1DbRealmProxy) realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ActivityPhase1DbRealmProxy) realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class, json.getInt("phase1Id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'phase1Id'.");
            }
        }
        if (json.has("phase1Supervisor")) {
            if (json.isNull("phase1Supervisor")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Supervisor(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Supervisor((String) json.getString("phase1Supervisor"));
            }
        }
        if (json.has("phase1District")) {
            if (json.isNull("phase1District")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1District(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1District((String) json.getString("phase1District"));
            }
        }
        if (json.has("phase1Date")) {
            if (json.isNull("phase1Date")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Date(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Date((String) json.getString("phase1Date"));
            }
        }
        if (json.has("phase1Mother")) {
            if (json.isNull("phase1Mother")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Mother(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Mother((String) json.getString("phase1Mother"));
            }
        }
        if (json.has("phase1MotherAge")) {
            if (json.isNull("phase1MotherAge")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherAge(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherAge((String) json.getString("phase1MotherAge"));
            }
        }
        if (json.has("phase1MotherContact")) {
            if (json.isNull("phase1MotherContact")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherContact(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherContact((String) json.getString("phase1MotherContact"));
            }
        }
        if (json.has("phase1MotherAddress")) {
            if (json.isNull("phase1MotherAddress")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherAddress(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherAddress((String) json.getString("phase1MotherAddress"));
            }
        }
        if (json.has("phase1Answer1Db")) {
            if (json.isNull("phase1Answer1Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer1Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer1Db((String) json.getString("phase1Answer1Db"));
            }
        }
        if (json.has("phase1Answer2Db")) {
            if (json.isNull("phase1Answer2Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer2Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer2Db((String) json.getString("phase1Answer2Db"));
            }
        }
        if (json.has("phase1Answer3Db")) {
            if (json.isNull("phase1Answer3Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer3Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer3Db((String) json.getString("phase1Answer3Db"));
            }
        }
        if (json.has("phase1Answer4Db")) {
            if (json.isNull("phase1Answer4Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer4Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer4Db((String) json.getString("phase1Answer4Db"));
            }
        }
        if (json.has("phase1Answer5Db")) {
            if (json.isNull("phase1Answer5Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer5Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer5Db((String) json.getString("phase1Answer5Db"));
            }
        }
        if (json.has("phase1Answer6Db")) {
            if (json.isNull("phase1Answer6Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer6Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer6Db((String) json.getString("phase1Answer6Db"));
            }
        }
        if (json.has("phase1Answer7Db")) {
            if (json.isNull("phase1Answer7Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer7Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer7Db((String) json.getString("phase1Answer7Db"));
            }
        }
        if (json.has("phase1Answer8Db")) {
            if (json.isNull("phase1Answer8Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer8Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer8Db((String) json.getString("phase1Answer8Db"));
            }
        }
        if (json.has("phase1Answer9Db")) {
            if (json.isNull("phase1Answer9Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer9Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer9Db((String) json.getString("phase1Answer9Db"));
            }
        }
        if (json.has("phase1Answer10Db")) {
            if (json.isNull("phase1Answer10Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer10Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer10Db((String) json.getString("phase1Answer10Db"));
            }
        }
        if (json.has("phase1Answer11Db")) {
            if (json.isNull("phase1Answer11Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer11Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer11Db((String) json.getString("phase1Answer11Db"));
            }
        }
        if (json.has("phase1Answer12Db")) {
            if (json.isNull("phase1Answer12Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer12Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer12Db((String) json.getString("phase1Answer12Db"));
            }
        }
        if (json.has("phase1Answer13Db")) {
            if (json.isNull("phase1Answer13Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer13Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer13Db((String) json.getString("phase1Answer13Db"));
            }
        }
        if (json.has("phase1Answer14Db")) {
            if (json.isNull("phase1Answer14Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer14Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer14Db((String) json.getString("phase1Answer14Db"));
            }
        }
        if (json.has("phase1Answer15Db")) {
            if (json.isNull("phase1Answer15Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer15Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer15Db((String) json.getString("phase1Answer15Db"));
            }
        }
        if (json.has("phase1Answer16Db")) {
            if (json.isNull("phase1Answer16Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer16Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer16Db((String) json.getString("phase1Answer16Db"));
            }
        }
        if (json.has("phase1Answer17Db")) {
            if (json.isNull("phase1Answer17Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer17Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer17Db((String) json.getString("phase1Answer17Db"));
            }
        }
        if (json.has("phase1Answer18Db")) {
            if (json.isNull("phase1Answer18Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer18Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer18Db((String) json.getString("phase1Answer18Db"));
            }
        }
        if (json.has("phase1Answer19Db")) {
            if (json.isNull("phase1Answer19Db")) {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer19Db(null);
            } else {
                ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer19Db((String) json.getString("phase1Answer19Db"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db obj = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("phase1Id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'phase1Id' to null.");
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("phase1Supervisor")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Supervisor(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Supervisor((String) reader.nextString());
                }
            } else if (name.equals("phase1District")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1District(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1District((String) reader.nextString());
                }
            } else if (name.equals("phase1Date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Date(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Date((String) reader.nextString());
                }
            } else if (name.equals("phase1Mother")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Mother(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Mother((String) reader.nextString());
                }
            } else if (name.equals("phase1MotherAge")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherAge(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherAge((String) reader.nextString());
                }
            } else if (name.equals("phase1MotherContact")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherContact(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherContact((String) reader.nextString());
                }
            } else if (name.equals("phase1MotherAddress")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherAddress(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1MotherAddress((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer1Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer1Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer1Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer2Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer2Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer2Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer3Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer3Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer3Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer4Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer4Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer4Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer5Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer5Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer5Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer6Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer6Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer6Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer7Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer7Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer7Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer8Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer8Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer8Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer9Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer9Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer9Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer10Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer10Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer10Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer11Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer11Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer11Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer12Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer12Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer12Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer13Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer13Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer13Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer14Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer14Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer14Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer15Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer15Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer15Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer16Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer16Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer16Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer17Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer17Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer17Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer18Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer18Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer18Db((String) reader.nextString());
                }
            } else if (name.equals("phase1Answer19Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer19Db(null);
                } else {
                    ((ActivityPhase1DbRealmProxyInterface) obj).realmSet$phase1Answer19Db((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'phase1Id'.");
        }
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
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.ActivityPhase1DbRealmProxy();
                        cache.put(object, (RealmObjectProxy) realmObject);
                    } finally {
                        objectContext.clear();
                    }
                } else {
                    canUpdate = false;
                }
            }

            if (canUpdate) {
                return update(realm, realmObject, object, cache);
            } else {
                return copy(realm, object, update, cache);
            }
        }
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db copy(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db realmObject = realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class, ((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Supervisor(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Supervisor());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1District(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1District());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Date(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Date());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Mother(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Mother());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1MotherAge(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1MotherAge());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1MotherContact(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1MotherContact());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1MotherAddress(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1MotherAddress());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer1Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer1Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer2Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer2Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer3Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer3Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer4Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer4Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer5Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer5Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer6Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer6Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer7Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer7Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer8Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer8Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer9Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer9Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer10Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer10Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer11Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer11Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer12Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer12Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer13Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer13Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer14Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer14Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer15Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer15Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer16Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer16Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer17Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer17Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer18Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer18Db());
            ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer19Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer19Db());
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
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id(), false);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$phase1Supervisor = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Supervisor();
        if (realmGet$phase1Supervisor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1SupervisorIndex, rowIndex, realmGet$phase1Supervisor, false);
        }
        String realmGet$phase1District = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1District();
        if (realmGet$phase1District != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1DistrictIndex, rowIndex, realmGet$phase1District, false);
        }
        String realmGet$phase1Date = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Date();
        if (realmGet$phase1Date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1DateIndex, rowIndex, realmGet$phase1Date, false);
        }
        String realmGet$phase1Mother = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Mother();
        if (realmGet$phase1Mother != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherIndex, rowIndex, realmGet$phase1Mother, false);
        }
        String realmGet$phase1MotherAge = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherAge();
        if (realmGet$phase1MotherAge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherAgeIndex, rowIndex, realmGet$phase1MotherAge, false);
        }
        String realmGet$phase1MotherContact = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherContact();
        if (realmGet$phase1MotherContact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherContactIndex, rowIndex, realmGet$phase1MotherContact, false);
        }
        String realmGet$phase1MotherAddress = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherAddress();
        if (realmGet$phase1MotherAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherAddressIndex, rowIndex, realmGet$phase1MotherAddress, false);
        }
        String realmGet$phase1Answer1Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer1Db();
        if (realmGet$phase1Answer1Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer1DbIndex, rowIndex, realmGet$phase1Answer1Db, false);
        }
        String realmGet$phase1Answer2Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer2Db();
        if (realmGet$phase1Answer2Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer2DbIndex, rowIndex, realmGet$phase1Answer2Db, false);
        }
        String realmGet$phase1Answer3Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer3Db();
        if (realmGet$phase1Answer3Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer3DbIndex, rowIndex, realmGet$phase1Answer3Db, false);
        }
        String realmGet$phase1Answer4Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer4Db();
        if (realmGet$phase1Answer4Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer4DbIndex, rowIndex, realmGet$phase1Answer4Db, false);
        }
        String realmGet$phase1Answer5Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer5Db();
        if (realmGet$phase1Answer5Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer5DbIndex, rowIndex, realmGet$phase1Answer5Db, false);
        }
        String realmGet$phase1Answer6Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer6Db();
        if (realmGet$phase1Answer6Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer6DbIndex, rowIndex, realmGet$phase1Answer6Db, false);
        }
        String realmGet$phase1Answer7Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer7Db();
        if (realmGet$phase1Answer7Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer7DbIndex, rowIndex, realmGet$phase1Answer7Db, false);
        }
        String realmGet$phase1Answer8Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer8Db();
        if (realmGet$phase1Answer8Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer8DbIndex, rowIndex, realmGet$phase1Answer8Db, false);
        }
        String realmGet$phase1Answer9Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer9Db();
        if (realmGet$phase1Answer9Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer9DbIndex, rowIndex, realmGet$phase1Answer9Db, false);
        }
        String realmGet$phase1Answer10Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer10Db();
        if (realmGet$phase1Answer10Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer10DbIndex, rowIndex, realmGet$phase1Answer10Db, false);
        }
        String realmGet$phase1Answer11Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer11Db();
        if (realmGet$phase1Answer11Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer11DbIndex, rowIndex, realmGet$phase1Answer11Db, false);
        }
        String realmGet$phase1Answer12Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer12Db();
        if (realmGet$phase1Answer12Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer12DbIndex, rowIndex, realmGet$phase1Answer12Db, false);
        }
        String realmGet$phase1Answer13Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer13Db();
        if (realmGet$phase1Answer13Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer13DbIndex, rowIndex, realmGet$phase1Answer13Db, false);
        }
        String realmGet$phase1Answer14Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer14Db();
        if (realmGet$phase1Answer14Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer14DbIndex, rowIndex, realmGet$phase1Answer14Db, false);
        }
        String realmGet$phase1Answer15Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer15Db();
        if (realmGet$phase1Answer15Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer15DbIndex, rowIndex, realmGet$phase1Answer15Db, false);
        }
        String realmGet$phase1Answer16Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer16Db();
        if (realmGet$phase1Answer16Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer16DbIndex, rowIndex, realmGet$phase1Answer16Db, false);
        }
        String realmGet$phase1Answer17Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer17Db();
        if (realmGet$phase1Answer17Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer17DbIndex, rowIndex, realmGet$phase1Answer17Db, false);
        }
        String realmGet$phase1Answer18Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer18Db();
        if (realmGet$phase1Answer18Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer18DbIndex, rowIndex, realmGet$phase1Answer18Db, false);
        }
        String realmGet$phase1Answer19Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer19Db();
        if (realmGet$phase1Answer19Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer19DbIndex, rowIndex, realmGet$phase1Answer19Db, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase1DbColumnInfo columnInfo = (ActivityPhase1DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id(), false);
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$phase1Supervisor = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Supervisor();
                if (realmGet$phase1Supervisor != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1SupervisorIndex, rowIndex, realmGet$phase1Supervisor, false);
                }
                String realmGet$phase1District = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1District();
                if (realmGet$phase1District != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1DistrictIndex, rowIndex, realmGet$phase1District, false);
                }
                String realmGet$phase1Date = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Date();
                if (realmGet$phase1Date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1DateIndex, rowIndex, realmGet$phase1Date, false);
                }
                String realmGet$phase1Mother = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Mother();
                if (realmGet$phase1Mother != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherIndex, rowIndex, realmGet$phase1Mother, false);
                }
                String realmGet$phase1MotherAge = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherAge();
                if (realmGet$phase1MotherAge != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherAgeIndex, rowIndex, realmGet$phase1MotherAge, false);
                }
                String realmGet$phase1MotherContact = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherContact();
                if (realmGet$phase1MotherContact != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherContactIndex, rowIndex, realmGet$phase1MotherContact, false);
                }
                String realmGet$phase1MotherAddress = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherAddress();
                if (realmGet$phase1MotherAddress != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherAddressIndex, rowIndex, realmGet$phase1MotherAddress, false);
                }
                String realmGet$phase1Answer1Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer1Db();
                if (realmGet$phase1Answer1Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer1DbIndex, rowIndex, realmGet$phase1Answer1Db, false);
                }
                String realmGet$phase1Answer2Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer2Db();
                if (realmGet$phase1Answer2Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer2DbIndex, rowIndex, realmGet$phase1Answer2Db, false);
                }
                String realmGet$phase1Answer3Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer3Db();
                if (realmGet$phase1Answer3Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer3DbIndex, rowIndex, realmGet$phase1Answer3Db, false);
                }
                String realmGet$phase1Answer4Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer4Db();
                if (realmGet$phase1Answer4Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer4DbIndex, rowIndex, realmGet$phase1Answer4Db, false);
                }
                String realmGet$phase1Answer5Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer5Db();
                if (realmGet$phase1Answer5Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer5DbIndex, rowIndex, realmGet$phase1Answer5Db, false);
                }
                String realmGet$phase1Answer6Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer6Db();
                if (realmGet$phase1Answer6Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer6DbIndex, rowIndex, realmGet$phase1Answer6Db, false);
                }
                String realmGet$phase1Answer7Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer7Db();
                if (realmGet$phase1Answer7Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer7DbIndex, rowIndex, realmGet$phase1Answer7Db, false);
                }
                String realmGet$phase1Answer8Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer8Db();
                if (realmGet$phase1Answer8Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer8DbIndex, rowIndex, realmGet$phase1Answer8Db, false);
                }
                String realmGet$phase1Answer9Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer9Db();
                if (realmGet$phase1Answer9Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer9DbIndex, rowIndex, realmGet$phase1Answer9Db, false);
                }
                String realmGet$phase1Answer10Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer10Db();
                if (realmGet$phase1Answer10Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer10DbIndex, rowIndex, realmGet$phase1Answer10Db, false);
                }
                String realmGet$phase1Answer11Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer11Db();
                if (realmGet$phase1Answer11Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer11DbIndex, rowIndex, realmGet$phase1Answer11Db, false);
                }
                String realmGet$phase1Answer12Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer12Db();
                if (realmGet$phase1Answer12Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer12DbIndex, rowIndex, realmGet$phase1Answer12Db, false);
                }
                String realmGet$phase1Answer13Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer13Db();
                if (realmGet$phase1Answer13Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer13DbIndex, rowIndex, realmGet$phase1Answer13Db, false);
                }
                String realmGet$phase1Answer14Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer14Db();
                if (realmGet$phase1Answer14Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer14DbIndex, rowIndex, realmGet$phase1Answer14Db, false);
                }
                String realmGet$phase1Answer15Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer15Db();
                if (realmGet$phase1Answer15Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer15DbIndex, rowIndex, realmGet$phase1Answer15Db, false);
                }
                String realmGet$phase1Answer16Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer16Db();
                if (realmGet$phase1Answer16Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer16DbIndex, rowIndex, realmGet$phase1Answer16Db, false);
                }
                String realmGet$phase1Answer17Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer17Db();
                if (realmGet$phase1Answer17Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer17DbIndex, rowIndex, realmGet$phase1Answer17Db, false);
                }
                String realmGet$phase1Answer18Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer18Db();
                if (realmGet$phase1Answer18Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer18DbIndex, rowIndex, realmGet$phase1Answer18Db, false);
                }
                String realmGet$phase1Answer19Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer19Db();
                if (realmGet$phase1Answer19Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer19DbIndex, rowIndex, realmGet$phase1Answer19Db, false);
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
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id(), false);
        }
        cache.put(object, rowIndex);
        String realmGet$phase1Supervisor = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Supervisor();
        if (realmGet$phase1Supervisor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1SupervisorIndex, rowIndex, realmGet$phase1Supervisor, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1SupervisorIndex, rowIndex, false);
        }
        String realmGet$phase1District = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1District();
        if (realmGet$phase1District != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1DistrictIndex, rowIndex, realmGet$phase1District, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1DistrictIndex, rowIndex, false);
        }
        String realmGet$phase1Date = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Date();
        if (realmGet$phase1Date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1DateIndex, rowIndex, realmGet$phase1Date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1DateIndex, rowIndex, false);
        }
        String realmGet$phase1Mother = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Mother();
        if (realmGet$phase1Mother != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherIndex, rowIndex, realmGet$phase1Mother, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1MotherIndex, rowIndex, false);
        }
        String realmGet$phase1MotherAge = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherAge();
        if (realmGet$phase1MotherAge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherAgeIndex, rowIndex, realmGet$phase1MotherAge, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1MotherAgeIndex, rowIndex, false);
        }
        String realmGet$phase1MotherContact = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherContact();
        if (realmGet$phase1MotherContact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherContactIndex, rowIndex, realmGet$phase1MotherContact, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1MotherContactIndex, rowIndex, false);
        }
        String realmGet$phase1MotherAddress = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherAddress();
        if (realmGet$phase1MotherAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherAddressIndex, rowIndex, realmGet$phase1MotherAddress, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1MotherAddressIndex, rowIndex, false);
        }
        String realmGet$phase1Answer1Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer1Db();
        if (realmGet$phase1Answer1Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer1DbIndex, rowIndex, realmGet$phase1Answer1Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer1DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer2Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer2Db();
        if (realmGet$phase1Answer2Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer2DbIndex, rowIndex, realmGet$phase1Answer2Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer2DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer3Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer3Db();
        if (realmGet$phase1Answer3Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer3DbIndex, rowIndex, realmGet$phase1Answer3Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer3DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer4Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer4Db();
        if (realmGet$phase1Answer4Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer4DbIndex, rowIndex, realmGet$phase1Answer4Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer4DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer5Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer5Db();
        if (realmGet$phase1Answer5Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer5DbIndex, rowIndex, realmGet$phase1Answer5Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer5DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer6Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer6Db();
        if (realmGet$phase1Answer6Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer6DbIndex, rowIndex, realmGet$phase1Answer6Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer6DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer7Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer7Db();
        if (realmGet$phase1Answer7Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer7DbIndex, rowIndex, realmGet$phase1Answer7Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer7DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer8Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer8Db();
        if (realmGet$phase1Answer8Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer8DbIndex, rowIndex, realmGet$phase1Answer8Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer8DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer9Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer9Db();
        if (realmGet$phase1Answer9Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer9DbIndex, rowIndex, realmGet$phase1Answer9Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer9DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer10Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer10Db();
        if (realmGet$phase1Answer10Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer10DbIndex, rowIndex, realmGet$phase1Answer10Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer10DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer11Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer11Db();
        if (realmGet$phase1Answer11Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer11DbIndex, rowIndex, realmGet$phase1Answer11Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer11DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer12Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer12Db();
        if (realmGet$phase1Answer12Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer12DbIndex, rowIndex, realmGet$phase1Answer12Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer12DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer13Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer13Db();
        if (realmGet$phase1Answer13Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer13DbIndex, rowIndex, realmGet$phase1Answer13Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer13DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer14Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer14Db();
        if (realmGet$phase1Answer14Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer14DbIndex, rowIndex, realmGet$phase1Answer14Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer14DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer15Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer15Db();
        if (realmGet$phase1Answer15Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer15DbIndex, rowIndex, realmGet$phase1Answer15Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer15DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer16Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer16Db();
        if (realmGet$phase1Answer16Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer16DbIndex, rowIndex, realmGet$phase1Answer16Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer16DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer17Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer17Db();
        if (realmGet$phase1Answer17Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer17DbIndex, rowIndex, realmGet$phase1Answer17Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer17DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer18Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer18Db();
        if (realmGet$phase1Answer18Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer18DbIndex, rowIndex, realmGet$phase1Answer18Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer18DbIndex, rowIndex, false);
        }
        String realmGet$phase1Answer19Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer19Db();
        if (realmGet$phase1Answer19Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer19DbIndex, rowIndex, realmGet$phase1Answer19Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer19DbIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase1DbColumnInfo columnInfo = (ActivityPhase1DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase1DbRealmProxyInterface) object).realmGet$phase1Id(), false);
                }
                cache.put(object, rowIndex);
                String realmGet$phase1Supervisor = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Supervisor();
                if (realmGet$phase1Supervisor != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1SupervisorIndex, rowIndex, realmGet$phase1Supervisor, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1SupervisorIndex, rowIndex, false);
                }
                String realmGet$phase1District = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1District();
                if (realmGet$phase1District != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1DistrictIndex, rowIndex, realmGet$phase1District, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1DistrictIndex, rowIndex, false);
                }
                String realmGet$phase1Date = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Date();
                if (realmGet$phase1Date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1DateIndex, rowIndex, realmGet$phase1Date, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1DateIndex, rowIndex, false);
                }
                String realmGet$phase1Mother = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Mother();
                if (realmGet$phase1Mother != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherIndex, rowIndex, realmGet$phase1Mother, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1MotherIndex, rowIndex, false);
                }
                String realmGet$phase1MotherAge = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherAge();
                if (realmGet$phase1MotherAge != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherAgeIndex, rowIndex, realmGet$phase1MotherAge, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1MotherAgeIndex, rowIndex, false);
                }
                String realmGet$phase1MotherContact = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherContact();
                if (realmGet$phase1MotherContact != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherContactIndex, rowIndex, realmGet$phase1MotherContact, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1MotherContactIndex, rowIndex, false);
                }
                String realmGet$phase1MotherAddress = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1MotherAddress();
                if (realmGet$phase1MotherAddress != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1MotherAddressIndex, rowIndex, realmGet$phase1MotherAddress, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1MotherAddressIndex, rowIndex, false);
                }
                String realmGet$phase1Answer1Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer1Db();
                if (realmGet$phase1Answer1Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer1DbIndex, rowIndex, realmGet$phase1Answer1Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer1DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer2Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer2Db();
                if (realmGet$phase1Answer2Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer2DbIndex, rowIndex, realmGet$phase1Answer2Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer2DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer3Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer3Db();
                if (realmGet$phase1Answer3Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer3DbIndex, rowIndex, realmGet$phase1Answer3Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer3DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer4Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer4Db();
                if (realmGet$phase1Answer4Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer4DbIndex, rowIndex, realmGet$phase1Answer4Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer4DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer5Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer5Db();
                if (realmGet$phase1Answer5Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer5DbIndex, rowIndex, realmGet$phase1Answer5Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer5DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer6Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer6Db();
                if (realmGet$phase1Answer6Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer6DbIndex, rowIndex, realmGet$phase1Answer6Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer6DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer7Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer7Db();
                if (realmGet$phase1Answer7Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer7DbIndex, rowIndex, realmGet$phase1Answer7Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer7DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer8Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer8Db();
                if (realmGet$phase1Answer8Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer8DbIndex, rowIndex, realmGet$phase1Answer8Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer8DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer9Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer9Db();
                if (realmGet$phase1Answer9Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer9DbIndex, rowIndex, realmGet$phase1Answer9Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer9DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer10Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer10Db();
                if (realmGet$phase1Answer10Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer10DbIndex, rowIndex, realmGet$phase1Answer10Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer10DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer11Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer11Db();
                if (realmGet$phase1Answer11Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer11DbIndex, rowIndex, realmGet$phase1Answer11Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer11DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer12Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer12Db();
                if (realmGet$phase1Answer12Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer12DbIndex, rowIndex, realmGet$phase1Answer12Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer12DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer13Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer13Db();
                if (realmGet$phase1Answer13Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer13DbIndex, rowIndex, realmGet$phase1Answer13Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer13DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer14Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer14Db();
                if (realmGet$phase1Answer14Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer14DbIndex, rowIndex, realmGet$phase1Answer14Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer14DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer15Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer15Db();
                if (realmGet$phase1Answer15Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer15DbIndex, rowIndex, realmGet$phase1Answer15Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer15DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer16Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer16Db();
                if (realmGet$phase1Answer16Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer16DbIndex, rowIndex, realmGet$phase1Answer16Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer16DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer17Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer17Db();
                if (realmGet$phase1Answer17Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer17DbIndex, rowIndex, realmGet$phase1Answer17Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer17DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer18Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer18Db();
                if (realmGet$phase1Answer18Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer18DbIndex, rowIndex, realmGet$phase1Answer18Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer18DbIndex, rowIndex, false);
                }
                String realmGet$phase1Answer19Db = ((ActivityPhase1DbRealmProxyInterface)object).realmGet$phase1Answer19Db();
                if (realmGet$phase1Answer19Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase1Answer19DbIndex, rowIndex, realmGet$phase1Answer19Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase1Answer19DbIndex, rowIndex, false);
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
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Id(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Id());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Supervisor(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Supervisor());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1District(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1District());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Date(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Date());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Mother(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Mother());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1MotherAge(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1MotherAge());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1MotherContact(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1MotherContact());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1MotherAddress(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1MotherAddress());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer1Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer1Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer2Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer2Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer3Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer3Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer4Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer4Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer5Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer5Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer6Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer6Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer7Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer7Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer8Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer8Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer9Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer9Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer10Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer10Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer11Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer11Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer12Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer12Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer13Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer13Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer14Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer14Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer15Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer15Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer16Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer16Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer17Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer17Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer18Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer18Db());
        ((ActivityPhase1DbRealmProxyInterface) unmanagedObject).realmSet$phase1Answer19Db(((ActivityPhase1DbRealmProxyInterface) realmObject).realmGet$phase1Answer19Db());
        return unmanagedObject;
    }

    static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db update(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db realmObject, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase1Db newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Supervisor(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Supervisor());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1District(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1District());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Date(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Date());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Mother(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Mother());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1MotherAge(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1MotherAge());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1MotherContact(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1MotherContact());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1MotherAddress(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1MotherAddress());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer1Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer1Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer2Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer2Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer3Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer3Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer4Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer4Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer5Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer5Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer6Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer6Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer7Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer7Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer8Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer8Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer9Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer9Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer10Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer10Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer11Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer11Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer12Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer12Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer13Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer13Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer14Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer14Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer15Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer15Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer16Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer16Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer17Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer17Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer18Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer18Db());
        ((ActivityPhase1DbRealmProxyInterface) realmObject).realmSet$phase1Answer19Db(((ActivityPhase1DbRealmProxyInterface) newObject).realmGet$phase1Answer19Db());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ActivityPhase1Db = [");
        stringBuilder.append("{phase1Id:");
        stringBuilder.append(realmGet$phase1Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Supervisor:");
        stringBuilder.append(realmGet$phase1Supervisor() != null ? realmGet$phase1Supervisor() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1District:");
        stringBuilder.append(realmGet$phase1District() != null ? realmGet$phase1District() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Date:");
        stringBuilder.append(realmGet$phase1Date() != null ? realmGet$phase1Date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Mother:");
        stringBuilder.append(realmGet$phase1Mother() != null ? realmGet$phase1Mother() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1MotherAge:");
        stringBuilder.append(realmGet$phase1MotherAge() != null ? realmGet$phase1MotherAge() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1MotherContact:");
        stringBuilder.append(realmGet$phase1MotherContact() != null ? realmGet$phase1MotherContact() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1MotherAddress:");
        stringBuilder.append(realmGet$phase1MotherAddress() != null ? realmGet$phase1MotherAddress() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer1Db:");
        stringBuilder.append(realmGet$phase1Answer1Db() != null ? realmGet$phase1Answer1Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer2Db:");
        stringBuilder.append(realmGet$phase1Answer2Db() != null ? realmGet$phase1Answer2Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer3Db:");
        stringBuilder.append(realmGet$phase1Answer3Db() != null ? realmGet$phase1Answer3Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer4Db:");
        stringBuilder.append(realmGet$phase1Answer4Db() != null ? realmGet$phase1Answer4Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer5Db:");
        stringBuilder.append(realmGet$phase1Answer5Db() != null ? realmGet$phase1Answer5Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer6Db:");
        stringBuilder.append(realmGet$phase1Answer6Db() != null ? realmGet$phase1Answer6Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer7Db:");
        stringBuilder.append(realmGet$phase1Answer7Db() != null ? realmGet$phase1Answer7Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer8Db:");
        stringBuilder.append(realmGet$phase1Answer8Db() != null ? realmGet$phase1Answer8Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer9Db:");
        stringBuilder.append(realmGet$phase1Answer9Db() != null ? realmGet$phase1Answer9Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer10Db:");
        stringBuilder.append(realmGet$phase1Answer10Db() != null ? realmGet$phase1Answer10Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer11Db:");
        stringBuilder.append(realmGet$phase1Answer11Db() != null ? realmGet$phase1Answer11Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer12Db:");
        stringBuilder.append(realmGet$phase1Answer12Db() != null ? realmGet$phase1Answer12Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer13Db:");
        stringBuilder.append(realmGet$phase1Answer13Db() != null ? realmGet$phase1Answer13Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer14Db:");
        stringBuilder.append(realmGet$phase1Answer14Db() != null ? realmGet$phase1Answer14Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer15Db:");
        stringBuilder.append(realmGet$phase1Answer15Db() != null ? realmGet$phase1Answer15Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer16Db:");
        stringBuilder.append(realmGet$phase1Answer16Db() != null ? realmGet$phase1Answer16Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer17Db:");
        stringBuilder.append(realmGet$phase1Answer17Db() != null ? realmGet$phase1Answer17Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer18Db:");
        stringBuilder.append(realmGet$phase1Answer18Db() != null ? realmGet$phase1Answer18Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase1Answer19Db:");
        stringBuilder.append(realmGet$phase1Answer19Db() != null ? realmGet$phase1Answer19Db() : "null");
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
