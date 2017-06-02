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

public class ActivityPhase4DbRealmProxy extends mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db
    implements RealmObjectProxy, ActivityPhase4DbRealmProxyInterface {

    static final class ActivityPhase4DbColumnInfo extends ColumnInfo
        implements Cloneable {

        public long phase4IdIndex;
        public long phase4SupervisorIndex;
        public long phase4DistrictIndex;
        public long phase4DateIndex;
        public long phase4MotherIndex;
        public long phase4MotherAgeIndex;
        public long phase4MotherContactIndex;
        public long phase4MotherAddressIndex;
        public long phase4Answer1DbIndex;
        public long phase4Answer2DbIndex;
        public long phase4Answer3DbIndex;
        public long phase4Answer4DbIndex;
        public long phase4Answer5DbIndex;
        public long phase4Answer6DbIndex;
        public long phase4Answer7DbIndex;
        public long phase4Answer8DbIndex;
        public long phase4Answer9DbIndex;
        public long phase4Answer10DbIndex;
        public long phase4Answer11DbIndex;
        public long phase4Answer12DbIndex;
        public long phase4Answer13DbIndex;
        public long phase4Answer14DbIndex;
        public long phase4Answer15DbIndex;
        public long phase4Answer16DbIndex;
        public long phase4Answer17DbIndex;
        public long phase4Answer18DbIndex;
        public long phase4Answer19DbIndex;
        public long phase4Answer20DbIndex;
        public long phase4Answer21DbIndex;
        public long phase4Answer22DbIndex;

        ActivityPhase4DbColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(30);
            this.phase4IdIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Id");
            indicesMap.put("phase4Id", this.phase4IdIndex);
            this.phase4SupervisorIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Supervisor");
            indicesMap.put("phase4Supervisor", this.phase4SupervisorIndex);
            this.phase4DistrictIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4District");
            indicesMap.put("phase4District", this.phase4DistrictIndex);
            this.phase4DateIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Date");
            indicesMap.put("phase4Date", this.phase4DateIndex);
            this.phase4MotherIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Mother");
            indicesMap.put("phase4Mother", this.phase4MotherIndex);
            this.phase4MotherAgeIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4MotherAge");
            indicesMap.put("phase4MotherAge", this.phase4MotherAgeIndex);
            this.phase4MotherContactIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4MotherContact");
            indicesMap.put("phase4MotherContact", this.phase4MotherContactIndex);
            this.phase4MotherAddressIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4MotherAddress");
            indicesMap.put("phase4MotherAddress", this.phase4MotherAddressIndex);
            this.phase4Answer1DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer1Db");
            indicesMap.put("phase4Answer1Db", this.phase4Answer1DbIndex);
            this.phase4Answer2DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer2Db");
            indicesMap.put("phase4Answer2Db", this.phase4Answer2DbIndex);
            this.phase4Answer3DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer3Db");
            indicesMap.put("phase4Answer3Db", this.phase4Answer3DbIndex);
            this.phase4Answer4DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer4Db");
            indicesMap.put("phase4Answer4Db", this.phase4Answer4DbIndex);
            this.phase4Answer5DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer5Db");
            indicesMap.put("phase4Answer5Db", this.phase4Answer5DbIndex);
            this.phase4Answer6DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer6Db");
            indicesMap.put("phase4Answer6Db", this.phase4Answer6DbIndex);
            this.phase4Answer7DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer7Db");
            indicesMap.put("phase4Answer7Db", this.phase4Answer7DbIndex);
            this.phase4Answer8DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer8Db");
            indicesMap.put("phase4Answer8Db", this.phase4Answer8DbIndex);
            this.phase4Answer9DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer9Db");
            indicesMap.put("phase4Answer9Db", this.phase4Answer9DbIndex);
            this.phase4Answer10DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer10Db");
            indicesMap.put("phase4Answer10Db", this.phase4Answer10DbIndex);
            this.phase4Answer11DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer11Db");
            indicesMap.put("phase4Answer11Db", this.phase4Answer11DbIndex);
            this.phase4Answer12DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer12Db");
            indicesMap.put("phase4Answer12Db", this.phase4Answer12DbIndex);
            this.phase4Answer13DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer13Db");
            indicesMap.put("phase4Answer13Db", this.phase4Answer13DbIndex);
            this.phase4Answer14DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer14Db");
            indicesMap.put("phase4Answer14Db", this.phase4Answer14DbIndex);
            this.phase4Answer15DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer15Db");
            indicesMap.put("phase4Answer15Db", this.phase4Answer15DbIndex);
            this.phase4Answer16DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer16Db");
            indicesMap.put("phase4Answer16Db", this.phase4Answer16DbIndex);
            this.phase4Answer17DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer17Db");
            indicesMap.put("phase4Answer17Db", this.phase4Answer17DbIndex);
            this.phase4Answer18DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer18Db");
            indicesMap.put("phase4Answer18Db", this.phase4Answer18DbIndex);
            this.phase4Answer19DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer19Db");
            indicesMap.put("phase4Answer19Db", this.phase4Answer19DbIndex);
            this.phase4Answer20DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer20Db");
            indicesMap.put("phase4Answer20Db", this.phase4Answer20DbIndex);
            this.phase4Answer21DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer21Db");
            indicesMap.put("phase4Answer21Db", this.phase4Answer21DbIndex);
            this.phase4Answer22DbIndex = getValidColumnIndex(path, table, "ActivityPhase4Db", "phase4Answer22Db");
            indicesMap.put("phase4Answer22Db", this.phase4Answer22DbIndex);

            setIndicesMap(indicesMap);
        }

        @Override
        public final void copyColumnInfoFrom(ColumnInfo other) {
            final ActivityPhase4DbColumnInfo otherInfo = (ActivityPhase4DbColumnInfo) other;
            this.phase4IdIndex = otherInfo.phase4IdIndex;
            this.phase4SupervisorIndex = otherInfo.phase4SupervisorIndex;
            this.phase4DistrictIndex = otherInfo.phase4DistrictIndex;
            this.phase4DateIndex = otherInfo.phase4DateIndex;
            this.phase4MotherIndex = otherInfo.phase4MotherIndex;
            this.phase4MotherAgeIndex = otherInfo.phase4MotherAgeIndex;
            this.phase4MotherContactIndex = otherInfo.phase4MotherContactIndex;
            this.phase4MotherAddressIndex = otherInfo.phase4MotherAddressIndex;
            this.phase4Answer1DbIndex = otherInfo.phase4Answer1DbIndex;
            this.phase4Answer2DbIndex = otherInfo.phase4Answer2DbIndex;
            this.phase4Answer3DbIndex = otherInfo.phase4Answer3DbIndex;
            this.phase4Answer4DbIndex = otherInfo.phase4Answer4DbIndex;
            this.phase4Answer5DbIndex = otherInfo.phase4Answer5DbIndex;
            this.phase4Answer6DbIndex = otherInfo.phase4Answer6DbIndex;
            this.phase4Answer7DbIndex = otherInfo.phase4Answer7DbIndex;
            this.phase4Answer8DbIndex = otherInfo.phase4Answer8DbIndex;
            this.phase4Answer9DbIndex = otherInfo.phase4Answer9DbIndex;
            this.phase4Answer10DbIndex = otherInfo.phase4Answer10DbIndex;
            this.phase4Answer11DbIndex = otherInfo.phase4Answer11DbIndex;
            this.phase4Answer12DbIndex = otherInfo.phase4Answer12DbIndex;
            this.phase4Answer13DbIndex = otherInfo.phase4Answer13DbIndex;
            this.phase4Answer14DbIndex = otherInfo.phase4Answer14DbIndex;
            this.phase4Answer15DbIndex = otherInfo.phase4Answer15DbIndex;
            this.phase4Answer16DbIndex = otherInfo.phase4Answer16DbIndex;
            this.phase4Answer17DbIndex = otherInfo.phase4Answer17DbIndex;
            this.phase4Answer18DbIndex = otherInfo.phase4Answer18DbIndex;
            this.phase4Answer19DbIndex = otherInfo.phase4Answer19DbIndex;
            this.phase4Answer20DbIndex = otherInfo.phase4Answer20DbIndex;
            this.phase4Answer21DbIndex = otherInfo.phase4Answer21DbIndex;
            this.phase4Answer22DbIndex = otherInfo.phase4Answer22DbIndex;

            setIndicesMap(otherInfo.getIndicesMap());
        }

        @Override
        public final ActivityPhase4DbColumnInfo clone() {
            return (ActivityPhase4DbColumnInfo) super.clone();
        }

    }
    private ActivityPhase4DbColumnInfo columnInfo;
    private ProxyState proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("phase4Id");
        fieldNames.add("phase4Supervisor");
        fieldNames.add("phase4District");
        fieldNames.add("phase4Date");
        fieldNames.add("phase4Mother");
        fieldNames.add("phase4MotherAge");
        fieldNames.add("phase4MotherContact");
        fieldNames.add("phase4MotherAddress");
        fieldNames.add("phase4Answer1Db");
        fieldNames.add("phase4Answer2Db");
        fieldNames.add("phase4Answer3Db");
        fieldNames.add("phase4Answer4Db");
        fieldNames.add("phase4Answer5Db");
        fieldNames.add("phase4Answer6Db");
        fieldNames.add("phase4Answer7Db");
        fieldNames.add("phase4Answer8Db");
        fieldNames.add("phase4Answer9Db");
        fieldNames.add("phase4Answer10Db");
        fieldNames.add("phase4Answer11Db");
        fieldNames.add("phase4Answer12Db");
        fieldNames.add("phase4Answer13Db");
        fieldNames.add("phase4Answer14Db");
        fieldNames.add("phase4Answer15Db");
        fieldNames.add("phase4Answer16Db");
        fieldNames.add("phase4Answer17Db");
        fieldNames.add("phase4Answer18Db");
        fieldNames.add("phase4Answer19Db");
        fieldNames.add("phase4Answer20Db");
        fieldNames.add("phase4Answer21Db");
        fieldNames.add("phase4Answer22Db");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ActivityPhase4DbRealmProxy() {
        if (proxyState == null) {
            injectObjectContext();
        }
        proxyState.setConstructionFinished();
    }

    private void injectObjectContext() {
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ActivityPhase4DbColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class, this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @SuppressWarnings("cast")
    public int realmGet$phase4Id() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.phase4IdIndex);
    }

    public void realmSet$phase4Id(int value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'phase4Id' cannot be changed after object was created.");
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Supervisor() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4SupervisorIndex);
    }

    public void realmSet$phase4Supervisor(String value) {
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
                row.getTable().setNull(columnInfo.phase4SupervisorIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4SupervisorIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4SupervisorIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4SupervisorIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4District() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4DistrictIndex);
    }

    public void realmSet$phase4District(String value) {
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
                row.getTable().setNull(columnInfo.phase4DistrictIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4DistrictIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4DistrictIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4DistrictIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Date() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4DateIndex);
    }

    public void realmSet$phase4Date(String value) {
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
                row.getTable().setNull(columnInfo.phase4DateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4DateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4DateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4DateIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Mother() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4MotherIndex);
    }

    public void realmSet$phase4Mother(String value) {
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
                row.getTable().setNull(columnInfo.phase4MotherIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4MotherIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4MotherIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4MotherIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4MotherAge() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4MotherAgeIndex);
    }

    public void realmSet$phase4MotherAge(String value) {
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
                row.getTable().setNull(columnInfo.phase4MotherAgeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4MotherAgeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4MotherAgeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4MotherAgeIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4MotherContact() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4MotherContactIndex);
    }

    public void realmSet$phase4MotherContact(String value) {
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
                row.getTable().setNull(columnInfo.phase4MotherContactIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4MotherContactIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4MotherContactIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4MotherContactIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4MotherAddress() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4MotherAddressIndex);
    }

    public void realmSet$phase4MotherAddress(String value) {
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
                row.getTable().setNull(columnInfo.phase4MotherAddressIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4MotherAddressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4MotherAddressIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4MotherAddressIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer1Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer1DbIndex);
    }

    public void realmSet$phase4Answer1Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer1DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer1DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer1DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer1DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer2Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer2DbIndex);
    }

    public void realmSet$phase4Answer2Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer2DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer2DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer2DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer2DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer3Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer3DbIndex);
    }

    public void realmSet$phase4Answer3Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer3DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer3DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer3DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer3DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer4Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer4DbIndex);
    }

    public void realmSet$phase4Answer4Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer4DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer4DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer4DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer4DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer5Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer5DbIndex);
    }

    public void realmSet$phase4Answer5Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer5DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer5DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer5DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer5DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer6Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer6DbIndex);
    }

    public void realmSet$phase4Answer6Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer6DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer6DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer6DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer6DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer7Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer7DbIndex);
    }

    public void realmSet$phase4Answer7Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer7DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer7DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer7DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer7DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer8Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer8DbIndex);
    }

    public void realmSet$phase4Answer8Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer8DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer8DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer8DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer8DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer9Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer9DbIndex);
    }

    public void realmSet$phase4Answer9Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer9DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer9DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer9DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer9DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer10Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer10DbIndex);
    }

    public void realmSet$phase4Answer10Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer10DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer10DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer10DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer10DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer11Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer11DbIndex);
    }

    public void realmSet$phase4Answer11Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer11DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer11DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer11DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer11DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer12Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer12DbIndex);
    }

    public void realmSet$phase4Answer12Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer12DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer12DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer12DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer12DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer13Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer13DbIndex);
    }

    public void realmSet$phase4Answer13Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer13DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer13DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer13DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer13DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer14Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer14DbIndex);
    }

    public void realmSet$phase4Answer14Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer14DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer14DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer14DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer14DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer15Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer15DbIndex);
    }

    public void realmSet$phase4Answer15Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer15DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer15DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer15DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer15DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer16Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer16DbIndex);
    }

    public void realmSet$phase4Answer16Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer16DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer16DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer16DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer16DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer17Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer17DbIndex);
    }

    public void realmSet$phase4Answer17Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer17DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer17DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer17DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer17DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer18Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer18DbIndex);
    }

    public void realmSet$phase4Answer18Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer18DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer18DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer18DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer18DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer19Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer19DbIndex);
    }

    public void realmSet$phase4Answer19Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer19DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer19DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer19DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer19DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer20Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer20DbIndex);
    }

    public void realmSet$phase4Answer20Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer20DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer20DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer20DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer20DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer21Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer21DbIndex);
    }

    public void realmSet$phase4Answer21Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer21DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer21DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer21DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer21DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase4Answer22Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase4Answer22DbIndex);
    }

    public void realmSet$phase4Answer22Db(String value) {
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
                row.getTable().setNull(columnInfo.phase4Answer22DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase4Answer22DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase4Answer22DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase4Answer22DbIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("ActivityPhase4Db")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("ActivityPhase4Db");
            realmObjectSchema.add(new Property("phase4Id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Supervisor", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4District", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Mother", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4MotherAge", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4MotherContact", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4MotherAddress", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer1Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer2Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer3Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer4Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer5Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer6Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer7Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer8Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer9Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer10Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer11Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer12Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer13Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer14Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer15Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer16Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer17Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer18Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer19Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer20Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer21Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase4Answer22Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            return realmObjectSchema;
        }
        return realmSchema.get("ActivityPhase4Db");
    }

    public static Table initTable(SharedRealm sharedRealm) {
        if (!sharedRealm.hasTable("class_ActivityPhase4Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase4Db");
            table.addColumn(RealmFieldType.INTEGER, "phase4Id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Supervisor", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4District", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Date", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Mother", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4MotherAge", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4MotherContact", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4MotherAddress", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer1Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer2Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer3Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer4Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer5Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer6Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer7Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer8Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer9Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer10Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer11Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer12Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer13Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer14Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer15Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer16Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer17Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer18Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer19Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer20Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer21Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase4Answer22Db", Table.NULLABLE);
            table.addSearchIndex(table.getColumnIndex("phase4Id"));
            table.setPrimaryKey("phase4Id");
            return table;
        }
        return sharedRealm.getTable("class_ActivityPhase4Db");
    }

    public static ActivityPhase4DbColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (sharedRealm.hasTable("class_ActivityPhase4Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase4Db");
            final long columnCount = table.getColumnCount();
            if (columnCount != 30) {
                if (columnCount < 30) {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 30 but was " + columnCount);
                }
                if (allowExtraColumns) {
                    RealmLog.debug("Field count is more than expected - expected 30 but was %1$d", columnCount);
                } else {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 30 but was " + columnCount);
                }
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < columnCount; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final ActivityPhase4DbColumnInfo columnInfo = new ActivityPhase4DbColumnInfo(sharedRealm.getPath(), table);

            if (!columnTypes.containsKey("phase4Id")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Id") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'phase4Id' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.phase4IdIndex) && table.findFirstNull(columnInfo.phase4IdIndex) != TableOrView.NO_MATCH) {
                throw new IllegalStateException("Cannot migrate an object with null value in field 'phase4Id'. Either maintain the same type for primary key field 'phase4Id', or remove the object with null value before migration.");
            }
            if (table.getPrimaryKey() != table.getColumnIndex("phase4Id")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'phase4Id' in existing Realm file. Add @PrimaryKey.");
            }
            if (!table.hasSearchIndex(table.getColumnIndex("phase4Id"))) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'phase4Id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
            }
            if (!columnTypes.containsKey("phase4Supervisor")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Supervisor' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Supervisor") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Supervisor' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4SupervisorIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Supervisor' is required. Either set @Required to field 'phase4Supervisor' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4District")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4District' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4District") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4District' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4DistrictIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4District' is required. Either set @Required to field 'phase4District' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Date")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Date") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Date' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4DateIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Date' is required. Either set @Required to field 'phase4Date' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Mother")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Mother' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Mother") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Mother' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4MotherIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Mother' is required. Either set @Required to field 'phase4Mother' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4MotherAge")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4MotherAge' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4MotherAge") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4MotherAge' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4MotherAgeIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4MotherAge' is required. Either set @Required to field 'phase4MotherAge' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4MotherContact")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4MotherContact' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4MotherContact") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4MotherContact' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4MotherContactIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4MotherContact' is required. Either set @Required to field 'phase4MotherContact' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4MotherAddress")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4MotherAddress' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4MotherAddress") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4MotherAddress' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4MotherAddressIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4MotherAddress' is required. Either set @Required to field 'phase4MotherAddress' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer1Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer1Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer1Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer1Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer1DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer1Db' is required. Either set @Required to field 'phase4Answer1Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer2Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer2Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer2Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer2Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer2DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer2Db' is required. Either set @Required to field 'phase4Answer2Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer3Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer3Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer3Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer3Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer3DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer3Db' is required. Either set @Required to field 'phase4Answer3Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer4Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer4Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer4Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer4Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer4DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer4Db' is required. Either set @Required to field 'phase4Answer4Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer5Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer5Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer5Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer5Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer5DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer5Db' is required. Either set @Required to field 'phase4Answer5Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer6Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer6Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer6Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer6Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer6DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer6Db' is required. Either set @Required to field 'phase4Answer6Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer7Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer7Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer7Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer7Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer7DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer7Db' is required. Either set @Required to field 'phase4Answer7Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer8Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer8Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer8Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer8Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer8DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer8Db' is required. Either set @Required to field 'phase4Answer8Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer9Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer9Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer9Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer9Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer9DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer9Db' is required. Either set @Required to field 'phase4Answer9Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer10Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer10Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer10Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer10Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer10DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer10Db' is required. Either set @Required to field 'phase4Answer10Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer11Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer11Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer11Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer11Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer11DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer11Db' is required. Either set @Required to field 'phase4Answer11Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer12Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer12Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer12Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer12Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer12DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer12Db' is required. Either set @Required to field 'phase4Answer12Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer13Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer13Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer13Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer13Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer13DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer13Db' is required. Either set @Required to field 'phase4Answer13Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer14Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer14Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer14Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer14Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer14DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer14Db' is required. Either set @Required to field 'phase4Answer14Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer15Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer15Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer15Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer15Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer15DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer15Db' is required. Either set @Required to field 'phase4Answer15Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer16Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer16Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer16Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer16Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer16DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer16Db' is required. Either set @Required to field 'phase4Answer16Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer17Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer17Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer17Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer17Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer17DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer17Db' is required. Either set @Required to field 'phase4Answer17Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer18Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer18Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer18Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer18Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer18DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer18Db' is required. Either set @Required to field 'phase4Answer18Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer19Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer19Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer19Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer19Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer19DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer19Db' is required. Either set @Required to field 'phase4Answer19Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer20Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer20Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer20Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer20Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer20DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer20Db' is required. Either set @Required to field 'phase4Answer20Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer21Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer21Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer21Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer21Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer21DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer21Db' is required. Either set @Required to field 'phase4Answer21Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase4Answer22Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase4Answer22Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase4Answer22Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase4Answer22Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase4Answer22DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase4Answer22Db' is required. Either set @Required to field 'phase4Answer22Db' or migrate using RealmObjectSchema.setNullable().");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'ActivityPhase4Db' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_ActivityPhase4Db";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db obj = null;
        if (update) {
            Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("phase4Id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("phase4Id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ActivityPhase4DbRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("phase4Id")) {
                if (json.isNull("phase4Id")) {
                    obj = (io.realm.ActivityPhase4DbRealmProxy) realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ActivityPhase4DbRealmProxy) realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class, json.getInt("phase4Id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'phase4Id'.");
            }
        }
        if (json.has("phase4Supervisor")) {
            if (json.isNull("phase4Supervisor")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Supervisor(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Supervisor((String) json.getString("phase4Supervisor"));
            }
        }
        if (json.has("phase4District")) {
            if (json.isNull("phase4District")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4District(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4District((String) json.getString("phase4District"));
            }
        }
        if (json.has("phase4Date")) {
            if (json.isNull("phase4Date")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Date(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Date((String) json.getString("phase4Date"));
            }
        }
        if (json.has("phase4Mother")) {
            if (json.isNull("phase4Mother")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Mother(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Mother((String) json.getString("phase4Mother"));
            }
        }
        if (json.has("phase4MotherAge")) {
            if (json.isNull("phase4MotherAge")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherAge(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherAge((String) json.getString("phase4MotherAge"));
            }
        }
        if (json.has("phase4MotherContact")) {
            if (json.isNull("phase4MotherContact")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherContact(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherContact((String) json.getString("phase4MotherContact"));
            }
        }
        if (json.has("phase4MotherAddress")) {
            if (json.isNull("phase4MotherAddress")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherAddress(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherAddress((String) json.getString("phase4MotherAddress"));
            }
        }
        if (json.has("phase4Answer1Db")) {
            if (json.isNull("phase4Answer1Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer1Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer1Db((String) json.getString("phase4Answer1Db"));
            }
        }
        if (json.has("phase4Answer2Db")) {
            if (json.isNull("phase4Answer2Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer2Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer2Db((String) json.getString("phase4Answer2Db"));
            }
        }
        if (json.has("phase4Answer3Db")) {
            if (json.isNull("phase4Answer3Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer3Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer3Db((String) json.getString("phase4Answer3Db"));
            }
        }
        if (json.has("phase4Answer4Db")) {
            if (json.isNull("phase4Answer4Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer4Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer4Db((String) json.getString("phase4Answer4Db"));
            }
        }
        if (json.has("phase4Answer5Db")) {
            if (json.isNull("phase4Answer5Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer5Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer5Db((String) json.getString("phase4Answer5Db"));
            }
        }
        if (json.has("phase4Answer6Db")) {
            if (json.isNull("phase4Answer6Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer6Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer6Db((String) json.getString("phase4Answer6Db"));
            }
        }
        if (json.has("phase4Answer7Db")) {
            if (json.isNull("phase4Answer7Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer7Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer7Db((String) json.getString("phase4Answer7Db"));
            }
        }
        if (json.has("phase4Answer8Db")) {
            if (json.isNull("phase4Answer8Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer8Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer8Db((String) json.getString("phase4Answer8Db"));
            }
        }
        if (json.has("phase4Answer9Db")) {
            if (json.isNull("phase4Answer9Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer9Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer9Db((String) json.getString("phase4Answer9Db"));
            }
        }
        if (json.has("phase4Answer10Db")) {
            if (json.isNull("phase4Answer10Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer10Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer10Db((String) json.getString("phase4Answer10Db"));
            }
        }
        if (json.has("phase4Answer11Db")) {
            if (json.isNull("phase4Answer11Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer11Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer11Db((String) json.getString("phase4Answer11Db"));
            }
        }
        if (json.has("phase4Answer12Db")) {
            if (json.isNull("phase4Answer12Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer12Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer12Db((String) json.getString("phase4Answer12Db"));
            }
        }
        if (json.has("phase4Answer13Db")) {
            if (json.isNull("phase4Answer13Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer13Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer13Db((String) json.getString("phase4Answer13Db"));
            }
        }
        if (json.has("phase4Answer14Db")) {
            if (json.isNull("phase4Answer14Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer14Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer14Db((String) json.getString("phase4Answer14Db"));
            }
        }
        if (json.has("phase4Answer15Db")) {
            if (json.isNull("phase4Answer15Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer15Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer15Db((String) json.getString("phase4Answer15Db"));
            }
        }
        if (json.has("phase4Answer16Db")) {
            if (json.isNull("phase4Answer16Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer16Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer16Db((String) json.getString("phase4Answer16Db"));
            }
        }
        if (json.has("phase4Answer17Db")) {
            if (json.isNull("phase4Answer17Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer17Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer17Db((String) json.getString("phase4Answer17Db"));
            }
        }
        if (json.has("phase4Answer18Db")) {
            if (json.isNull("phase4Answer18Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer18Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer18Db((String) json.getString("phase4Answer18Db"));
            }
        }
        if (json.has("phase4Answer19Db")) {
            if (json.isNull("phase4Answer19Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer19Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer19Db((String) json.getString("phase4Answer19Db"));
            }
        }
        if (json.has("phase4Answer20Db")) {
            if (json.isNull("phase4Answer20Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer20Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer20Db((String) json.getString("phase4Answer20Db"));
            }
        }
        if (json.has("phase4Answer21Db")) {
            if (json.isNull("phase4Answer21Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer21Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer21Db((String) json.getString("phase4Answer21Db"));
            }
        }
        if (json.has("phase4Answer22Db")) {
            if (json.isNull("phase4Answer22Db")) {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer22Db(null);
            } else {
                ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer22Db((String) json.getString("phase4Answer22Db"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db obj = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("phase4Id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'phase4Id' to null.");
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("phase4Supervisor")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Supervisor(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Supervisor((String) reader.nextString());
                }
            } else if (name.equals("phase4District")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4District(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4District((String) reader.nextString());
                }
            } else if (name.equals("phase4Date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Date(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Date((String) reader.nextString());
                }
            } else if (name.equals("phase4Mother")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Mother(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Mother((String) reader.nextString());
                }
            } else if (name.equals("phase4MotherAge")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherAge(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherAge((String) reader.nextString());
                }
            } else if (name.equals("phase4MotherContact")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherContact(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherContact((String) reader.nextString());
                }
            } else if (name.equals("phase4MotherAddress")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherAddress(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4MotherAddress((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer1Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer1Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer1Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer2Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer2Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer2Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer3Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer3Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer3Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer4Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer4Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer4Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer5Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer5Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer5Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer6Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer6Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer6Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer7Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer7Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer7Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer8Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer8Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer8Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer9Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer9Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer9Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer10Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer10Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer10Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer11Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer11Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer11Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer12Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer12Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer12Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer13Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer13Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer13Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer14Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer14Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer14Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer15Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer15Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer15Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer16Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer16Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer16Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer17Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer17Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer17Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer18Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer18Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer18Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer19Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer19Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer19Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer20Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer20Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer20Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer21Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer21Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer21Db((String) reader.nextString());
                }
            } else if (name.equals("phase4Answer22Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer22Db(null);
                } else {
                    ((ActivityPhase4DbRealmProxyInterface) obj).realmSet$phase4Answer22Db((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'phase4Id'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db copyOrUpdate(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) cachedRealmObject;
        } else {
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.ActivityPhase4DbRealmProxy();
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

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db copy(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db realmObject = realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class, ((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Supervisor(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Supervisor());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4District(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4District());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Date(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Date());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Mother(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Mother());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4MotherAge(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4MotherAge());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4MotherContact(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4MotherContact());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4MotherAddress(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4MotherAddress());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer1Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer1Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer2Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer2Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer3Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer3Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer4Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer4Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer5Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer5Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer6Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer6Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer7Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer7Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer8Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer8Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer9Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer9Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer10Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer10Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer11Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer11Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer12Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer12Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer13Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer13Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer14Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer14Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer15Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer15Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer16Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer16Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer17Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer17Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer18Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer18Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer19Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer19Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer20Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer20Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer21Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer21Db());
            ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer22Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer22Db());
            return realmObject;
        }
    }

    public static long insert(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase4DbColumnInfo columnInfo = (ActivityPhase4DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id(), false);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$phase4Supervisor = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Supervisor();
        if (realmGet$phase4Supervisor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4SupervisorIndex, rowIndex, realmGet$phase4Supervisor, false);
        }
        String realmGet$phase4District = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4District();
        if (realmGet$phase4District != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4DistrictIndex, rowIndex, realmGet$phase4District, false);
        }
        String realmGet$phase4Date = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Date();
        if (realmGet$phase4Date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4DateIndex, rowIndex, realmGet$phase4Date, false);
        }
        String realmGet$phase4Mother = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Mother();
        if (realmGet$phase4Mother != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherIndex, rowIndex, realmGet$phase4Mother, false);
        }
        String realmGet$phase4MotherAge = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherAge();
        if (realmGet$phase4MotherAge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherAgeIndex, rowIndex, realmGet$phase4MotherAge, false);
        }
        String realmGet$phase4MotherContact = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherContact();
        if (realmGet$phase4MotherContact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherContactIndex, rowIndex, realmGet$phase4MotherContact, false);
        }
        String realmGet$phase4MotherAddress = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherAddress();
        if (realmGet$phase4MotherAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherAddressIndex, rowIndex, realmGet$phase4MotherAddress, false);
        }
        String realmGet$phase4Answer1Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer1Db();
        if (realmGet$phase4Answer1Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer1DbIndex, rowIndex, realmGet$phase4Answer1Db, false);
        }
        String realmGet$phase4Answer2Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer2Db();
        if (realmGet$phase4Answer2Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer2DbIndex, rowIndex, realmGet$phase4Answer2Db, false);
        }
        String realmGet$phase4Answer3Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer3Db();
        if (realmGet$phase4Answer3Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer3DbIndex, rowIndex, realmGet$phase4Answer3Db, false);
        }
        String realmGet$phase4Answer4Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer4Db();
        if (realmGet$phase4Answer4Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer4DbIndex, rowIndex, realmGet$phase4Answer4Db, false);
        }
        String realmGet$phase4Answer5Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer5Db();
        if (realmGet$phase4Answer5Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer5DbIndex, rowIndex, realmGet$phase4Answer5Db, false);
        }
        String realmGet$phase4Answer6Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer6Db();
        if (realmGet$phase4Answer6Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer6DbIndex, rowIndex, realmGet$phase4Answer6Db, false);
        }
        String realmGet$phase4Answer7Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer7Db();
        if (realmGet$phase4Answer7Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer7DbIndex, rowIndex, realmGet$phase4Answer7Db, false);
        }
        String realmGet$phase4Answer8Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer8Db();
        if (realmGet$phase4Answer8Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer8DbIndex, rowIndex, realmGet$phase4Answer8Db, false);
        }
        String realmGet$phase4Answer9Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer9Db();
        if (realmGet$phase4Answer9Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer9DbIndex, rowIndex, realmGet$phase4Answer9Db, false);
        }
        String realmGet$phase4Answer10Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer10Db();
        if (realmGet$phase4Answer10Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer10DbIndex, rowIndex, realmGet$phase4Answer10Db, false);
        }
        String realmGet$phase4Answer11Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer11Db();
        if (realmGet$phase4Answer11Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer11DbIndex, rowIndex, realmGet$phase4Answer11Db, false);
        }
        String realmGet$phase4Answer12Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer12Db();
        if (realmGet$phase4Answer12Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer12DbIndex, rowIndex, realmGet$phase4Answer12Db, false);
        }
        String realmGet$phase4Answer13Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer13Db();
        if (realmGet$phase4Answer13Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer13DbIndex, rowIndex, realmGet$phase4Answer13Db, false);
        }
        String realmGet$phase4Answer14Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer14Db();
        if (realmGet$phase4Answer14Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer14DbIndex, rowIndex, realmGet$phase4Answer14Db, false);
        }
        String realmGet$phase4Answer15Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer15Db();
        if (realmGet$phase4Answer15Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer15DbIndex, rowIndex, realmGet$phase4Answer15Db, false);
        }
        String realmGet$phase4Answer16Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer16Db();
        if (realmGet$phase4Answer16Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer16DbIndex, rowIndex, realmGet$phase4Answer16Db, false);
        }
        String realmGet$phase4Answer17Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer17Db();
        if (realmGet$phase4Answer17Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer17DbIndex, rowIndex, realmGet$phase4Answer17Db, false);
        }
        String realmGet$phase4Answer18Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer18Db();
        if (realmGet$phase4Answer18Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer18DbIndex, rowIndex, realmGet$phase4Answer18Db, false);
        }
        String realmGet$phase4Answer19Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer19Db();
        if (realmGet$phase4Answer19Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer19DbIndex, rowIndex, realmGet$phase4Answer19Db, false);
        }
        String realmGet$phase4Answer20Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer20Db();
        if (realmGet$phase4Answer20Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer20DbIndex, rowIndex, realmGet$phase4Answer20Db, false);
        }
        String realmGet$phase4Answer21Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer21Db();
        if (realmGet$phase4Answer21Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer21DbIndex, rowIndex, realmGet$phase4Answer21Db, false);
        }
        String realmGet$phase4Answer22Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer22Db();
        if (realmGet$phase4Answer22Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer22DbIndex, rowIndex, realmGet$phase4Answer22Db, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase4DbColumnInfo columnInfo = (ActivityPhase4DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id(), false);
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$phase4Supervisor = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Supervisor();
                if (realmGet$phase4Supervisor != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4SupervisorIndex, rowIndex, realmGet$phase4Supervisor, false);
                }
                String realmGet$phase4District = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4District();
                if (realmGet$phase4District != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4DistrictIndex, rowIndex, realmGet$phase4District, false);
                }
                String realmGet$phase4Date = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Date();
                if (realmGet$phase4Date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4DateIndex, rowIndex, realmGet$phase4Date, false);
                }
                String realmGet$phase4Mother = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Mother();
                if (realmGet$phase4Mother != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherIndex, rowIndex, realmGet$phase4Mother, false);
                }
                String realmGet$phase4MotherAge = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherAge();
                if (realmGet$phase4MotherAge != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherAgeIndex, rowIndex, realmGet$phase4MotherAge, false);
                }
                String realmGet$phase4MotherContact = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherContact();
                if (realmGet$phase4MotherContact != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherContactIndex, rowIndex, realmGet$phase4MotherContact, false);
                }
                String realmGet$phase4MotherAddress = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherAddress();
                if (realmGet$phase4MotherAddress != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherAddressIndex, rowIndex, realmGet$phase4MotherAddress, false);
                }
                String realmGet$phase4Answer1Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer1Db();
                if (realmGet$phase4Answer1Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer1DbIndex, rowIndex, realmGet$phase4Answer1Db, false);
                }
                String realmGet$phase4Answer2Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer2Db();
                if (realmGet$phase4Answer2Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer2DbIndex, rowIndex, realmGet$phase4Answer2Db, false);
                }
                String realmGet$phase4Answer3Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer3Db();
                if (realmGet$phase4Answer3Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer3DbIndex, rowIndex, realmGet$phase4Answer3Db, false);
                }
                String realmGet$phase4Answer4Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer4Db();
                if (realmGet$phase4Answer4Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer4DbIndex, rowIndex, realmGet$phase4Answer4Db, false);
                }
                String realmGet$phase4Answer5Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer5Db();
                if (realmGet$phase4Answer5Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer5DbIndex, rowIndex, realmGet$phase4Answer5Db, false);
                }
                String realmGet$phase4Answer6Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer6Db();
                if (realmGet$phase4Answer6Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer6DbIndex, rowIndex, realmGet$phase4Answer6Db, false);
                }
                String realmGet$phase4Answer7Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer7Db();
                if (realmGet$phase4Answer7Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer7DbIndex, rowIndex, realmGet$phase4Answer7Db, false);
                }
                String realmGet$phase4Answer8Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer8Db();
                if (realmGet$phase4Answer8Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer8DbIndex, rowIndex, realmGet$phase4Answer8Db, false);
                }
                String realmGet$phase4Answer9Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer9Db();
                if (realmGet$phase4Answer9Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer9DbIndex, rowIndex, realmGet$phase4Answer9Db, false);
                }
                String realmGet$phase4Answer10Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer10Db();
                if (realmGet$phase4Answer10Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer10DbIndex, rowIndex, realmGet$phase4Answer10Db, false);
                }
                String realmGet$phase4Answer11Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer11Db();
                if (realmGet$phase4Answer11Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer11DbIndex, rowIndex, realmGet$phase4Answer11Db, false);
                }
                String realmGet$phase4Answer12Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer12Db();
                if (realmGet$phase4Answer12Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer12DbIndex, rowIndex, realmGet$phase4Answer12Db, false);
                }
                String realmGet$phase4Answer13Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer13Db();
                if (realmGet$phase4Answer13Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer13DbIndex, rowIndex, realmGet$phase4Answer13Db, false);
                }
                String realmGet$phase4Answer14Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer14Db();
                if (realmGet$phase4Answer14Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer14DbIndex, rowIndex, realmGet$phase4Answer14Db, false);
                }
                String realmGet$phase4Answer15Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer15Db();
                if (realmGet$phase4Answer15Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer15DbIndex, rowIndex, realmGet$phase4Answer15Db, false);
                }
                String realmGet$phase4Answer16Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer16Db();
                if (realmGet$phase4Answer16Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer16DbIndex, rowIndex, realmGet$phase4Answer16Db, false);
                }
                String realmGet$phase4Answer17Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer17Db();
                if (realmGet$phase4Answer17Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer17DbIndex, rowIndex, realmGet$phase4Answer17Db, false);
                }
                String realmGet$phase4Answer18Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer18Db();
                if (realmGet$phase4Answer18Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer18DbIndex, rowIndex, realmGet$phase4Answer18Db, false);
                }
                String realmGet$phase4Answer19Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer19Db();
                if (realmGet$phase4Answer19Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer19DbIndex, rowIndex, realmGet$phase4Answer19Db, false);
                }
                String realmGet$phase4Answer20Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer20Db();
                if (realmGet$phase4Answer20Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer20DbIndex, rowIndex, realmGet$phase4Answer20Db, false);
                }
                String realmGet$phase4Answer21Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer21Db();
                if (realmGet$phase4Answer21Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer21DbIndex, rowIndex, realmGet$phase4Answer21Db, false);
                }
                String realmGet$phase4Answer22Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer22Db();
                if (realmGet$phase4Answer22Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer22DbIndex, rowIndex, realmGet$phase4Answer22Db, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase4DbColumnInfo columnInfo = (ActivityPhase4DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id(), false);
        }
        cache.put(object, rowIndex);
        String realmGet$phase4Supervisor = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Supervisor();
        if (realmGet$phase4Supervisor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4SupervisorIndex, rowIndex, realmGet$phase4Supervisor, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4SupervisorIndex, rowIndex, false);
        }
        String realmGet$phase4District = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4District();
        if (realmGet$phase4District != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4DistrictIndex, rowIndex, realmGet$phase4District, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4DistrictIndex, rowIndex, false);
        }
        String realmGet$phase4Date = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Date();
        if (realmGet$phase4Date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4DateIndex, rowIndex, realmGet$phase4Date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4DateIndex, rowIndex, false);
        }
        String realmGet$phase4Mother = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Mother();
        if (realmGet$phase4Mother != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherIndex, rowIndex, realmGet$phase4Mother, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4MotherIndex, rowIndex, false);
        }
        String realmGet$phase4MotherAge = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherAge();
        if (realmGet$phase4MotherAge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherAgeIndex, rowIndex, realmGet$phase4MotherAge, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4MotherAgeIndex, rowIndex, false);
        }
        String realmGet$phase4MotherContact = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherContact();
        if (realmGet$phase4MotherContact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherContactIndex, rowIndex, realmGet$phase4MotherContact, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4MotherContactIndex, rowIndex, false);
        }
        String realmGet$phase4MotherAddress = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherAddress();
        if (realmGet$phase4MotherAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherAddressIndex, rowIndex, realmGet$phase4MotherAddress, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4MotherAddressIndex, rowIndex, false);
        }
        String realmGet$phase4Answer1Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer1Db();
        if (realmGet$phase4Answer1Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer1DbIndex, rowIndex, realmGet$phase4Answer1Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer1DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer2Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer2Db();
        if (realmGet$phase4Answer2Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer2DbIndex, rowIndex, realmGet$phase4Answer2Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer2DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer3Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer3Db();
        if (realmGet$phase4Answer3Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer3DbIndex, rowIndex, realmGet$phase4Answer3Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer3DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer4Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer4Db();
        if (realmGet$phase4Answer4Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer4DbIndex, rowIndex, realmGet$phase4Answer4Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer4DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer5Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer5Db();
        if (realmGet$phase4Answer5Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer5DbIndex, rowIndex, realmGet$phase4Answer5Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer5DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer6Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer6Db();
        if (realmGet$phase4Answer6Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer6DbIndex, rowIndex, realmGet$phase4Answer6Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer6DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer7Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer7Db();
        if (realmGet$phase4Answer7Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer7DbIndex, rowIndex, realmGet$phase4Answer7Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer7DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer8Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer8Db();
        if (realmGet$phase4Answer8Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer8DbIndex, rowIndex, realmGet$phase4Answer8Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer8DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer9Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer9Db();
        if (realmGet$phase4Answer9Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer9DbIndex, rowIndex, realmGet$phase4Answer9Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer9DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer10Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer10Db();
        if (realmGet$phase4Answer10Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer10DbIndex, rowIndex, realmGet$phase4Answer10Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer10DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer11Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer11Db();
        if (realmGet$phase4Answer11Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer11DbIndex, rowIndex, realmGet$phase4Answer11Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer11DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer12Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer12Db();
        if (realmGet$phase4Answer12Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer12DbIndex, rowIndex, realmGet$phase4Answer12Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer12DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer13Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer13Db();
        if (realmGet$phase4Answer13Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer13DbIndex, rowIndex, realmGet$phase4Answer13Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer13DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer14Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer14Db();
        if (realmGet$phase4Answer14Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer14DbIndex, rowIndex, realmGet$phase4Answer14Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer14DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer15Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer15Db();
        if (realmGet$phase4Answer15Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer15DbIndex, rowIndex, realmGet$phase4Answer15Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer15DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer16Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer16Db();
        if (realmGet$phase4Answer16Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer16DbIndex, rowIndex, realmGet$phase4Answer16Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer16DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer17Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer17Db();
        if (realmGet$phase4Answer17Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer17DbIndex, rowIndex, realmGet$phase4Answer17Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer17DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer18Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer18Db();
        if (realmGet$phase4Answer18Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer18DbIndex, rowIndex, realmGet$phase4Answer18Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer18DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer19Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer19Db();
        if (realmGet$phase4Answer19Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer19DbIndex, rowIndex, realmGet$phase4Answer19Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer19DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer20Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer20Db();
        if (realmGet$phase4Answer20Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer20DbIndex, rowIndex, realmGet$phase4Answer20Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer20DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer21Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer21Db();
        if (realmGet$phase4Answer21Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer21DbIndex, rowIndex, realmGet$phase4Answer21Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer21DbIndex, rowIndex, false);
        }
        String realmGet$phase4Answer22Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer22Db();
        if (realmGet$phase4Answer22Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer22DbIndex, rowIndex, realmGet$phase4Answer22Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer22DbIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase4DbColumnInfo columnInfo = (ActivityPhase4DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase4DbRealmProxyInterface) object).realmGet$phase4Id(), false);
                }
                cache.put(object, rowIndex);
                String realmGet$phase4Supervisor = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Supervisor();
                if (realmGet$phase4Supervisor != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4SupervisorIndex, rowIndex, realmGet$phase4Supervisor, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4SupervisorIndex, rowIndex, false);
                }
                String realmGet$phase4District = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4District();
                if (realmGet$phase4District != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4DistrictIndex, rowIndex, realmGet$phase4District, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4DistrictIndex, rowIndex, false);
                }
                String realmGet$phase4Date = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Date();
                if (realmGet$phase4Date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4DateIndex, rowIndex, realmGet$phase4Date, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4DateIndex, rowIndex, false);
                }
                String realmGet$phase4Mother = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Mother();
                if (realmGet$phase4Mother != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherIndex, rowIndex, realmGet$phase4Mother, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4MotherIndex, rowIndex, false);
                }
                String realmGet$phase4MotherAge = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherAge();
                if (realmGet$phase4MotherAge != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherAgeIndex, rowIndex, realmGet$phase4MotherAge, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4MotherAgeIndex, rowIndex, false);
                }
                String realmGet$phase4MotherContact = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherContact();
                if (realmGet$phase4MotherContact != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherContactIndex, rowIndex, realmGet$phase4MotherContact, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4MotherContactIndex, rowIndex, false);
                }
                String realmGet$phase4MotherAddress = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4MotherAddress();
                if (realmGet$phase4MotherAddress != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4MotherAddressIndex, rowIndex, realmGet$phase4MotherAddress, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4MotherAddressIndex, rowIndex, false);
                }
                String realmGet$phase4Answer1Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer1Db();
                if (realmGet$phase4Answer1Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer1DbIndex, rowIndex, realmGet$phase4Answer1Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer1DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer2Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer2Db();
                if (realmGet$phase4Answer2Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer2DbIndex, rowIndex, realmGet$phase4Answer2Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer2DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer3Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer3Db();
                if (realmGet$phase4Answer3Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer3DbIndex, rowIndex, realmGet$phase4Answer3Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer3DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer4Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer4Db();
                if (realmGet$phase4Answer4Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer4DbIndex, rowIndex, realmGet$phase4Answer4Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer4DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer5Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer5Db();
                if (realmGet$phase4Answer5Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer5DbIndex, rowIndex, realmGet$phase4Answer5Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer5DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer6Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer6Db();
                if (realmGet$phase4Answer6Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer6DbIndex, rowIndex, realmGet$phase4Answer6Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer6DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer7Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer7Db();
                if (realmGet$phase4Answer7Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer7DbIndex, rowIndex, realmGet$phase4Answer7Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer7DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer8Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer8Db();
                if (realmGet$phase4Answer8Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer8DbIndex, rowIndex, realmGet$phase4Answer8Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer8DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer9Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer9Db();
                if (realmGet$phase4Answer9Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer9DbIndex, rowIndex, realmGet$phase4Answer9Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer9DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer10Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer10Db();
                if (realmGet$phase4Answer10Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer10DbIndex, rowIndex, realmGet$phase4Answer10Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer10DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer11Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer11Db();
                if (realmGet$phase4Answer11Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer11DbIndex, rowIndex, realmGet$phase4Answer11Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer11DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer12Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer12Db();
                if (realmGet$phase4Answer12Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer12DbIndex, rowIndex, realmGet$phase4Answer12Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer12DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer13Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer13Db();
                if (realmGet$phase4Answer13Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer13DbIndex, rowIndex, realmGet$phase4Answer13Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer13DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer14Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer14Db();
                if (realmGet$phase4Answer14Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer14DbIndex, rowIndex, realmGet$phase4Answer14Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer14DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer15Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer15Db();
                if (realmGet$phase4Answer15Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer15DbIndex, rowIndex, realmGet$phase4Answer15Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer15DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer16Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer16Db();
                if (realmGet$phase4Answer16Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer16DbIndex, rowIndex, realmGet$phase4Answer16Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer16DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer17Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer17Db();
                if (realmGet$phase4Answer17Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer17DbIndex, rowIndex, realmGet$phase4Answer17Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer17DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer18Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer18Db();
                if (realmGet$phase4Answer18Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer18DbIndex, rowIndex, realmGet$phase4Answer18Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer18DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer19Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer19Db();
                if (realmGet$phase4Answer19Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer19DbIndex, rowIndex, realmGet$phase4Answer19Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer19DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer20Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer20Db();
                if (realmGet$phase4Answer20Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer20DbIndex, rowIndex, realmGet$phase4Answer20Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer20DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer21Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer21Db();
                if (realmGet$phase4Answer21Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer21DbIndex, rowIndex, realmGet$phase4Answer21Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer21DbIndex, rowIndex, false);
                }
                String realmGet$phase4Answer22Db = ((ActivityPhase4DbRealmProxyInterface)object).realmGet$phase4Answer22Db();
                if (realmGet$phase4Answer22Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase4Answer22DbIndex, rowIndex, realmGet$phase4Answer22Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase4Answer22DbIndex, rowIndex, false);
                }
            }
        }
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db createDetachedCopy(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db)cachedObject.object;
            } else {
                unmanagedObject = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Id(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Id());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Supervisor(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Supervisor());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4District(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4District());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Date(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Date());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Mother(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Mother());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4MotherAge(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4MotherAge());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4MotherContact(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4MotherContact());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4MotherAddress(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4MotherAddress());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer1Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer1Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer2Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer2Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer3Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer3Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer4Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer4Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer5Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer5Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer6Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer6Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer7Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer7Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer8Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer8Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer9Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer9Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer10Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer10Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer11Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer11Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer12Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer12Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer13Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer13Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer14Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer14Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer15Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer15Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer16Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer16Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer17Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer17Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer18Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer18Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer19Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer19Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer20Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer20Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer21Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer21Db());
        ((ActivityPhase4DbRealmProxyInterface) unmanagedObject).realmSet$phase4Answer22Db(((ActivityPhase4DbRealmProxyInterface) realmObject).realmGet$phase4Answer22Db());
        return unmanagedObject;
    }

    static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db update(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db realmObject, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase4Db newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Supervisor(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Supervisor());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4District(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4District());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Date(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Date());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Mother(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Mother());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4MotherAge(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4MotherAge());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4MotherContact(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4MotherContact());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4MotherAddress(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4MotherAddress());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer1Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer1Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer2Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer2Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer3Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer3Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer4Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer4Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer5Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer5Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer6Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer6Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer7Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer7Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer8Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer8Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer9Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer9Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer10Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer10Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer11Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer11Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer12Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer12Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer13Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer13Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer14Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer14Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer15Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer15Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer16Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer16Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer17Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer17Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer18Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer18Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer19Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer19Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer20Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer20Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer21Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer21Db());
        ((ActivityPhase4DbRealmProxyInterface) realmObject).realmSet$phase4Answer22Db(((ActivityPhase4DbRealmProxyInterface) newObject).realmGet$phase4Answer22Db());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ActivityPhase4Db = [");
        stringBuilder.append("{phase4Id:");
        stringBuilder.append(realmGet$phase4Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Supervisor:");
        stringBuilder.append(realmGet$phase4Supervisor() != null ? realmGet$phase4Supervisor() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4District:");
        stringBuilder.append(realmGet$phase4District() != null ? realmGet$phase4District() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Date:");
        stringBuilder.append(realmGet$phase4Date() != null ? realmGet$phase4Date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Mother:");
        stringBuilder.append(realmGet$phase4Mother() != null ? realmGet$phase4Mother() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4MotherAge:");
        stringBuilder.append(realmGet$phase4MotherAge() != null ? realmGet$phase4MotherAge() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4MotherContact:");
        stringBuilder.append(realmGet$phase4MotherContact() != null ? realmGet$phase4MotherContact() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4MotherAddress:");
        stringBuilder.append(realmGet$phase4MotherAddress() != null ? realmGet$phase4MotherAddress() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer1Db:");
        stringBuilder.append(realmGet$phase4Answer1Db() != null ? realmGet$phase4Answer1Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer2Db:");
        stringBuilder.append(realmGet$phase4Answer2Db() != null ? realmGet$phase4Answer2Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer3Db:");
        stringBuilder.append(realmGet$phase4Answer3Db() != null ? realmGet$phase4Answer3Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer4Db:");
        stringBuilder.append(realmGet$phase4Answer4Db() != null ? realmGet$phase4Answer4Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer5Db:");
        stringBuilder.append(realmGet$phase4Answer5Db() != null ? realmGet$phase4Answer5Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer6Db:");
        stringBuilder.append(realmGet$phase4Answer6Db() != null ? realmGet$phase4Answer6Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer7Db:");
        stringBuilder.append(realmGet$phase4Answer7Db() != null ? realmGet$phase4Answer7Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer8Db:");
        stringBuilder.append(realmGet$phase4Answer8Db() != null ? realmGet$phase4Answer8Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer9Db:");
        stringBuilder.append(realmGet$phase4Answer9Db() != null ? realmGet$phase4Answer9Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer10Db:");
        stringBuilder.append(realmGet$phase4Answer10Db() != null ? realmGet$phase4Answer10Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer11Db:");
        stringBuilder.append(realmGet$phase4Answer11Db() != null ? realmGet$phase4Answer11Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer12Db:");
        stringBuilder.append(realmGet$phase4Answer12Db() != null ? realmGet$phase4Answer12Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer13Db:");
        stringBuilder.append(realmGet$phase4Answer13Db() != null ? realmGet$phase4Answer13Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer14Db:");
        stringBuilder.append(realmGet$phase4Answer14Db() != null ? realmGet$phase4Answer14Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer15Db:");
        stringBuilder.append(realmGet$phase4Answer15Db() != null ? realmGet$phase4Answer15Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer16Db:");
        stringBuilder.append(realmGet$phase4Answer16Db() != null ? realmGet$phase4Answer16Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer17Db:");
        stringBuilder.append(realmGet$phase4Answer17Db() != null ? realmGet$phase4Answer17Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer18Db:");
        stringBuilder.append(realmGet$phase4Answer18Db() != null ? realmGet$phase4Answer18Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer19Db:");
        stringBuilder.append(realmGet$phase4Answer19Db() != null ? realmGet$phase4Answer19Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer20Db:");
        stringBuilder.append(realmGet$phase4Answer20Db() != null ? realmGet$phase4Answer20Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer21Db:");
        stringBuilder.append(realmGet$phase4Answer21Db() != null ? realmGet$phase4Answer21Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase4Answer22Db:");
        stringBuilder.append(realmGet$phase4Answer22Db() != null ? realmGet$phase4Answer22Db() : "null");
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
        ActivityPhase4DbRealmProxy aActivityPhase4Db = (ActivityPhase4DbRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aActivityPhase4Db.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aActivityPhase4Db.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aActivityPhase4Db.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
