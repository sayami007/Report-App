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

        public long phase2IdIndex;
        public long phase2SupervisorIndex;
        public long phase2DistrictIndex;
        public long phase2DateIndex;
        public long phase2MotherIndex;
        public long phase2MotherAgeIndex;
        public long phase2MotherContactIndex;
        public long phase2MotherAddressIndex;
        public long phase2Answer1DbIndex;
        public long phase2Answer2DbIndex;
        public long phase2Answer3DbIndex;
        public long phase2Answer4DbIndex;
        public long phase2Answer5DbIndex;
        public long phase2Answer6DbIndex;
        public long phase2Answer7DbIndex;
        public long phase2Answer8DbIndex;
        public long phase2Answer9DbIndex;
        public long phase2Answer10DbIndex;
        public long phase2Answer11DbIndex;
        public long phase2Answer12DbIndex;
        public long phase2Answer13DbIndex;
        public long phase2Answer14DbIndex;
        public long phase2Answer15DbIndex;
        public long phase2Answer16DbIndex;
        public long phase2Answer17DbIndex;
        public long phase2Answer18DbIndex;
        public long phase2Answer19DbIndex;
        public long phase2Answer20DbIndex;
        public long phase2Answer21DbIndex;
        public long phase2Answer22DbIndex;
        public long phase2Answer23DbIndex;
        public long phase2Answer24DbIndex;
        public long phase2Answer25DbIndex;
        public long phase2Answer26DbIndex;
        public long phase2Answer27DbIndex;
        public long phase2Answer28DbIndex;
        public long phase2Answer29DbIndex;
        public long phase2Answer30DbIndex;

        ActivityPhase2DbColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(38);
            this.phase2IdIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Id");
            indicesMap.put("phase2Id", this.phase2IdIndex);
            this.phase2SupervisorIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Supervisor");
            indicesMap.put("phase2Supervisor", this.phase2SupervisorIndex);
            this.phase2DistrictIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2District");
            indicesMap.put("phase2District", this.phase2DistrictIndex);
            this.phase2DateIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Date");
            indicesMap.put("phase2Date", this.phase2DateIndex);
            this.phase2MotherIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Mother");
            indicesMap.put("phase2Mother", this.phase2MotherIndex);
            this.phase2MotherAgeIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2MotherAge");
            indicesMap.put("phase2MotherAge", this.phase2MotherAgeIndex);
            this.phase2MotherContactIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2MotherContact");
            indicesMap.put("phase2MotherContact", this.phase2MotherContactIndex);
            this.phase2MotherAddressIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2MotherAddress");
            indicesMap.put("phase2MotherAddress", this.phase2MotherAddressIndex);
            this.phase2Answer1DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer1Db");
            indicesMap.put("phase2Answer1Db", this.phase2Answer1DbIndex);
            this.phase2Answer2DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer2Db");
            indicesMap.put("phase2Answer2Db", this.phase2Answer2DbIndex);
            this.phase2Answer3DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer3Db");
            indicesMap.put("phase2Answer3Db", this.phase2Answer3DbIndex);
            this.phase2Answer4DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer4Db");
            indicesMap.put("phase2Answer4Db", this.phase2Answer4DbIndex);
            this.phase2Answer5DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer5Db");
            indicesMap.put("phase2Answer5Db", this.phase2Answer5DbIndex);
            this.phase2Answer6DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer6Db");
            indicesMap.put("phase2Answer6Db", this.phase2Answer6DbIndex);
            this.phase2Answer7DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer7Db");
            indicesMap.put("phase2Answer7Db", this.phase2Answer7DbIndex);
            this.phase2Answer8DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer8Db");
            indicesMap.put("phase2Answer8Db", this.phase2Answer8DbIndex);
            this.phase2Answer9DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer9Db");
            indicesMap.put("phase2Answer9Db", this.phase2Answer9DbIndex);
            this.phase2Answer10DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer10Db");
            indicesMap.put("phase2Answer10Db", this.phase2Answer10DbIndex);
            this.phase2Answer11DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer11Db");
            indicesMap.put("phase2Answer11Db", this.phase2Answer11DbIndex);
            this.phase2Answer12DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer12Db");
            indicesMap.put("phase2Answer12Db", this.phase2Answer12DbIndex);
            this.phase2Answer13DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer13Db");
            indicesMap.put("phase2Answer13Db", this.phase2Answer13DbIndex);
            this.phase2Answer14DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer14Db");
            indicesMap.put("phase2Answer14Db", this.phase2Answer14DbIndex);
            this.phase2Answer15DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer15Db");
            indicesMap.put("phase2Answer15Db", this.phase2Answer15DbIndex);
            this.phase2Answer16DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer16Db");
            indicesMap.put("phase2Answer16Db", this.phase2Answer16DbIndex);
            this.phase2Answer17DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer17Db");
            indicesMap.put("phase2Answer17Db", this.phase2Answer17DbIndex);
            this.phase2Answer18DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer18Db");
            indicesMap.put("phase2Answer18Db", this.phase2Answer18DbIndex);
            this.phase2Answer19DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer19Db");
            indicesMap.put("phase2Answer19Db", this.phase2Answer19DbIndex);
            this.phase2Answer20DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer20Db");
            indicesMap.put("phase2Answer20Db", this.phase2Answer20DbIndex);
            this.phase2Answer21DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer21Db");
            indicesMap.put("phase2Answer21Db", this.phase2Answer21DbIndex);
            this.phase2Answer22DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer22Db");
            indicesMap.put("phase2Answer22Db", this.phase2Answer22DbIndex);
            this.phase2Answer23DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer23Db");
            indicesMap.put("phase2Answer23Db", this.phase2Answer23DbIndex);
            this.phase2Answer24DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer24Db");
            indicesMap.put("phase2Answer24Db", this.phase2Answer24DbIndex);
            this.phase2Answer25DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer25Db");
            indicesMap.put("phase2Answer25Db", this.phase2Answer25DbIndex);
            this.phase2Answer26DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer26Db");
            indicesMap.put("phase2Answer26Db", this.phase2Answer26DbIndex);
            this.phase2Answer27DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer27Db");
            indicesMap.put("phase2Answer27Db", this.phase2Answer27DbIndex);
            this.phase2Answer28DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer28Db");
            indicesMap.put("phase2Answer28Db", this.phase2Answer28DbIndex);
            this.phase2Answer29DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer29Db");
            indicesMap.put("phase2Answer29Db", this.phase2Answer29DbIndex);
            this.phase2Answer30DbIndex = getValidColumnIndex(path, table, "ActivityPhase2Db", "phase2Answer30Db");
            indicesMap.put("phase2Answer30Db", this.phase2Answer30DbIndex);

            setIndicesMap(indicesMap);
        }

        @Override
        public final void copyColumnInfoFrom(ColumnInfo other) {
            final ActivityPhase2DbColumnInfo otherInfo = (ActivityPhase2DbColumnInfo) other;
            this.phase2IdIndex = otherInfo.phase2IdIndex;
            this.phase2SupervisorIndex = otherInfo.phase2SupervisorIndex;
            this.phase2DistrictIndex = otherInfo.phase2DistrictIndex;
            this.phase2DateIndex = otherInfo.phase2DateIndex;
            this.phase2MotherIndex = otherInfo.phase2MotherIndex;
            this.phase2MotherAgeIndex = otherInfo.phase2MotherAgeIndex;
            this.phase2MotherContactIndex = otherInfo.phase2MotherContactIndex;
            this.phase2MotherAddressIndex = otherInfo.phase2MotherAddressIndex;
            this.phase2Answer1DbIndex = otherInfo.phase2Answer1DbIndex;
            this.phase2Answer2DbIndex = otherInfo.phase2Answer2DbIndex;
            this.phase2Answer3DbIndex = otherInfo.phase2Answer3DbIndex;
            this.phase2Answer4DbIndex = otherInfo.phase2Answer4DbIndex;
            this.phase2Answer5DbIndex = otherInfo.phase2Answer5DbIndex;
            this.phase2Answer6DbIndex = otherInfo.phase2Answer6DbIndex;
            this.phase2Answer7DbIndex = otherInfo.phase2Answer7DbIndex;
            this.phase2Answer8DbIndex = otherInfo.phase2Answer8DbIndex;
            this.phase2Answer9DbIndex = otherInfo.phase2Answer9DbIndex;
            this.phase2Answer10DbIndex = otherInfo.phase2Answer10DbIndex;
            this.phase2Answer11DbIndex = otherInfo.phase2Answer11DbIndex;
            this.phase2Answer12DbIndex = otherInfo.phase2Answer12DbIndex;
            this.phase2Answer13DbIndex = otherInfo.phase2Answer13DbIndex;
            this.phase2Answer14DbIndex = otherInfo.phase2Answer14DbIndex;
            this.phase2Answer15DbIndex = otherInfo.phase2Answer15DbIndex;
            this.phase2Answer16DbIndex = otherInfo.phase2Answer16DbIndex;
            this.phase2Answer17DbIndex = otherInfo.phase2Answer17DbIndex;
            this.phase2Answer18DbIndex = otherInfo.phase2Answer18DbIndex;
            this.phase2Answer19DbIndex = otherInfo.phase2Answer19DbIndex;
            this.phase2Answer20DbIndex = otherInfo.phase2Answer20DbIndex;
            this.phase2Answer21DbIndex = otherInfo.phase2Answer21DbIndex;
            this.phase2Answer22DbIndex = otherInfo.phase2Answer22DbIndex;
            this.phase2Answer23DbIndex = otherInfo.phase2Answer23DbIndex;
            this.phase2Answer24DbIndex = otherInfo.phase2Answer24DbIndex;
            this.phase2Answer25DbIndex = otherInfo.phase2Answer25DbIndex;
            this.phase2Answer26DbIndex = otherInfo.phase2Answer26DbIndex;
            this.phase2Answer27DbIndex = otherInfo.phase2Answer27DbIndex;
            this.phase2Answer28DbIndex = otherInfo.phase2Answer28DbIndex;
            this.phase2Answer29DbIndex = otherInfo.phase2Answer29DbIndex;
            this.phase2Answer30DbIndex = otherInfo.phase2Answer30DbIndex;

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
        fieldNames.add("phase2Id");
        fieldNames.add("phase2Supervisor");
        fieldNames.add("phase2District");
        fieldNames.add("phase2Date");
        fieldNames.add("phase2Mother");
        fieldNames.add("phase2MotherAge");
        fieldNames.add("phase2MotherContact");
        fieldNames.add("phase2MotherAddress");
        fieldNames.add("phase2Answer1Db");
        fieldNames.add("phase2Answer2Db");
        fieldNames.add("phase2Answer3Db");
        fieldNames.add("phase2Answer4Db");
        fieldNames.add("phase2Answer5Db");
        fieldNames.add("phase2Answer6Db");
        fieldNames.add("phase2Answer7Db");
        fieldNames.add("phase2Answer8Db");
        fieldNames.add("phase2Answer9Db");
        fieldNames.add("phase2Answer10Db");
        fieldNames.add("phase2Answer11Db");
        fieldNames.add("phase2Answer12Db");
        fieldNames.add("phase2Answer13Db");
        fieldNames.add("phase2Answer14Db");
        fieldNames.add("phase2Answer15Db");
        fieldNames.add("phase2Answer16Db");
        fieldNames.add("phase2Answer17Db");
        fieldNames.add("phase2Answer18Db");
        fieldNames.add("phase2Answer19Db");
        fieldNames.add("phase2Answer20Db");
        fieldNames.add("phase2Answer21Db");
        fieldNames.add("phase2Answer22Db");
        fieldNames.add("phase2Answer23Db");
        fieldNames.add("phase2Answer24Db");
        fieldNames.add("phase2Answer25Db");
        fieldNames.add("phase2Answer26Db");
        fieldNames.add("phase2Answer27Db");
        fieldNames.add("phase2Answer28Db");
        fieldNames.add("phase2Answer29Db");
        fieldNames.add("phase2Answer30Db");
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

    @SuppressWarnings("cast")
    public int realmGet$phase2Id() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.phase2IdIndex);
    }

    public void realmSet$phase2Id(int value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'phase2Id' cannot be changed after object was created.");
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Supervisor() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2SupervisorIndex);
    }

    public void realmSet$phase2Supervisor(String value) {
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
                row.getTable().setNull(columnInfo.phase2SupervisorIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2SupervisorIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2SupervisorIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2SupervisorIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2District() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2DistrictIndex);
    }

    public void realmSet$phase2District(String value) {
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
                row.getTable().setNull(columnInfo.phase2DistrictIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2DistrictIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2DistrictIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2DistrictIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Date() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2DateIndex);
    }

    public void realmSet$phase2Date(String value) {
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
                row.getTable().setNull(columnInfo.phase2DateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2DateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2DateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2DateIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Mother() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2MotherIndex);
    }

    public void realmSet$phase2Mother(String value) {
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
                row.getTable().setNull(columnInfo.phase2MotherIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2MotherIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2MotherIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2MotherIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2MotherAge() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2MotherAgeIndex);
    }

    public void realmSet$phase2MotherAge(String value) {
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
                row.getTable().setNull(columnInfo.phase2MotherAgeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2MotherAgeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2MotherAgeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2MotherAgeIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2MotherContact() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2MotherContactIndex);
    }

    public void realmSet$phase2MotherContact(String value) {
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
                row.getTable().setNull(columnInfo.phase2MotherContactIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2MotherContactIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2MotherContactIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2MotherContactIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2MotherAddress() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2MotherAddressIndex);
    }

    public void realmSet$phase2MotherAddress(String value) {
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
                row.getTable().setNull(columnInfo.phase2MotherAddressIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2MotherAddressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2MotherAddressIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2MotherAddressIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer1Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer1DbIndex);
    }

    public void realmSet$phase2Answer1Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer1DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer1DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer1DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer1DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer2Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer2DbIndex);
    }

    public void realmSet$phase2Answer2Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer2DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer2DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer2DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer2DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer3Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer3DbIndex);
    }

    public void realmSet$phase2Answer3Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer3DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer3DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer3DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer3DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer4Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer4DbIndex);
    }

    public void realmSet$phase2Answer4Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer4DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer4DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer4DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer4DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer5Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer5DbIndex);
    }

    public void realmSet$phase2Answer5Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer5DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer5DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer5DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer5DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer6Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer6DbIndex);
    }

    public void realmSet$phase2Answer6Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer6DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer6DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer6DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer6DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer7Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer7DbIndex);
    }

    public void realmSet$phase2Answer7Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer7DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer7DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer7DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer7DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer8Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer8DbIndex);
    }

    public void realmSet$phase2Answer8Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer8DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer8DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer8DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer8DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer9Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer9DbIndex);
    }

    public void realmSet$phase2Answer9Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer9DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer9DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer9DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer9DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer10Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer10DbIndex);
    }

    public void realmSet$phase2Answer10Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer10DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer10DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer10DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer10DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer11Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer11DbIndex);
    }

    public void realmSet$phase2Answer11Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer11DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer11DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer11DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer11DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer12Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer12DbIndex);
    }

    public void realmSet$phase2Answer12Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer12DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer12DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer12DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer12DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer13Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer13DbIndex);
    }

    public void realmSet$phase2Answer13Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer13DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer13DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer13DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer13DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer14Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer14DbIndex);
    }

    public void realmSet$phase2Answer14Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer14DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer14DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer14DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer14DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer15Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer15DbIndex);
    }

    public void realmSet$phase2Answer15Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer15DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer15DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer15DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer15DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer16Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer16DbIndex);
    }

    public void realmSet$phase2Answer16Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer16DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer16DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer16DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer16DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer17Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer17DbIndex);
    }

    public void realmSet$phase2Answer17Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer17DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer17DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer17DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer17DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer18Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer18DbIndex);
    }

    public void realmSet$phase2Answer18Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer18DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer18DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer18DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer18DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer19Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer19DbIndex);
    }

    public void realmSet$phase2Answer19Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer19DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer19DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer19DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer19DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer20Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer20DbIndex);
    }

    public void realmSet$phase2Answer20Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer20DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer20DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer20DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer20DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer21Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer21DbIndex);
    }

    public void realmSet$phase2Answer21Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer21DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer21DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer21DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer21DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer22Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer22DbIndex);
    }

    public void realmSet$phase2Answer22Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer22DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer22DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer22DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer22DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer23Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer23DbIndex);
    }

    public void realmSet$phase2Answer23Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer23DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer23DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer23DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer23DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer24Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer24DbIndex);
    }

    public void realmSet$phase2Answer24Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer24DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer24DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer24DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer24DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer25Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer25DbIndex);
    }

    public void realmSet$phase2Answer25Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer25DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer25DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer25DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer25DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer26Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer26DbIndex);
    }

    public void realmSet$phase2Answer26Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer26DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer26DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer26DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer26DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer27Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer27DbIndex);
    }

    public void realmSet$phase2Answer27Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer27DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer27DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer27DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer27DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer28Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer28DbIndex);
    }

    public void realmSet$phase2Answer28Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer28DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer28DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer28DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer28DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer29Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer29DbIndex);
    }

    public void realmSet$phase2Answer29Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer29DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer29DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer29DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer29DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase2Answer30Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase2Answer30DbIndex);
    }

    public void realmSet$phase2Answer30Db(String value) {
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
                row.getTable().setNull(columnInfo.phase2Answer30DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase2Answer30DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase2Answer30DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase2Answer30DbIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("ActivityPhase2Db")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("ActivityPhase2Db");
            realmObjectSchema.add(new Property("phase2Id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Supervisor", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2District", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Mother", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2MotherAge", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2MotherContact", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2MotherAddress", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer1Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer2Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer3Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer4Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer5Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer6Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer7Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer8Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer9Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer10Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer11Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer12Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer13Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer14Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer15Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer16Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer17Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer18Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer19Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer20Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer21Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer22Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer23Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer24Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer25Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer26Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer27Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer28Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer29Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase2Answer30Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            return realmObjectSchema;
        }
        return realmSchema.get("ActivityPhase2Db");
    }

    public static Table initTable(SharedRealm sharedRealm) {
        if (!sharedRealm.hasTable("class_ActivityPhase2Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase2Db");
            table.addColumn(RealmFieldType.INTEGER, "phase2Id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Supervisor", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2District", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Date", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Mother", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2MotherAge", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2MotherContact", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2MotherAddress", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer1Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer2Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer3Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer4Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer5Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer6Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer7Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer8Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer9Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer10Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer11Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer12Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer13Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer14Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer15Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer16Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer17Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer18Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer19Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer20Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer21Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer22Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer23Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer24Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer25Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer26Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer27Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer28Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer29Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase2Answer30Db", Table.NULLABLE);
            table.addSearchIndex(table.getColumnIndex("phase2Id"));
            table.setPrimaryKey("phase2Id");
            return table;
        }
        return sharedRealm.getTable("class_ActivityPhase2Db");
    }

    public static ActivityPhase2DbColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (sharedRealm.hasTable("class_ActivityPhase2Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase2Db");
            final long columnCount = table.getColumnCount();
            if (columnCount != 38) {
                if (columnCount < 38) {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 38 but was " + columnCount);
                }
                if (allowExtraColumns) {
                    RealmLog.debug("Field count is more than expected - expected 38 but was %1$d", columnCount);
                } else {
                    throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 38 but was " + columnCount);
                }
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < columnCount; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final ActivityPhase2DbColumnInfo columnInfo = new ActivityPhase2DbColumnInfo(sharedRealm.getPath(), table);

            if (!columnTypes.containsKey("phase2Id")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Id") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'phase2Id' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.phase2IdIndex) && table.findFirstNull(columnInfo.phase2IdIndex) != TableOrView.NO_MATCH) {
                throw new IllegalStateException("Cannot migrate an object with null value in field 'phase2Id'. Either maintain the same type for primary key field 'phase2Id', or remove the object with null value before migration.");
            }
            if (table.getPrimaryKey() != table.getColumnIndex("phase2Id")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'phase2Id' in existing Realm file. Add @PrimaryKey.");
            }
            if (!table.hasSearchIndex(table.getColumnIndex("phase2Id"))) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'phase2Id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
            }
            if (!columnTypes.containsKey("phase2Supervisor")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Supervisor' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Supervisor") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Supervisor' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2SupervisorIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Supervisor' is required. Either set @Required to field 'phase2Supervisor' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2District")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2District' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2District") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2District' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2DistrictIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2District' is required. Either set @Required to field 'phase2District' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Date")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Date") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Date' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2DateIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Date' is required. Either set @Required to field 'phase2Date' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Mother")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Mother' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Mother") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Mother' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2MotherIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Mother' is required. Either set @Required to field 'phase2Mother' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2MotherAge")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2MotherAge' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2MotherAge") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2MotherAge' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2MotherAgeIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2MotherAge' is required. Either set @Required to field 'phase2MotherAge' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2MotherContact")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2MotherContact' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2MotherContact") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2MotherContact' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2MotherContactIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2MotherContact' is required. Either set @Required to field 'phase2MotherContact' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2MotherAddress")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2MotherAddress' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2MotherAddress") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2MotherAddress' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2MotherAddressIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2MotherAddress' is required. Either set @Required to field 'phase2MotherAddress' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer1Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer1Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer1Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer1Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer1DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer1Db' is required. Either set @Required to field 'phase2Answer1Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer2Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer2Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer2Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer2Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer2DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer2Db' is required. Either set @Required to field 'phase2Answer2Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer3Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer3Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer3Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer3Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer3DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer3Db' is required. Either set @Required to field 'phase2Answer3Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer4Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer4Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer4Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer4Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer4DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer4Db' is required. Either set @Required to field 'phase2Answer4Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer5Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer5Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer5Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer5Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer5DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer5Db' is required. Either set @Required to field 'phase2Answer5Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer6Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer6Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer6Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer6Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer6DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer6Db' is required. Either set @Required to field 'phase2Answer6Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer7Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer7Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer7Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer7Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer7DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer7Db' is required. Either set @Required to field 'phase2Answer7Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer8Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer8Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer8Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer8Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer8DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer8Db' is required. Either set @Required to field 'phase2Answer8Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer9Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer9Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer9Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer9Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer9DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer9Db' is required. Either set @Required to field 'phase2Answer9Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer10Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer10Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer10Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer10Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer10DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer10Db' is required. Either set @Required to field 'phase2Answer10Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer11Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer11Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer11Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer11Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer11DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer11Db' is required. Either set @Required to field 'phase2Answer11Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer12Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer12Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer12Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer12Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer12DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer12Db' is required. Either set @Required to field 'phase2Answer12Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer13Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer13Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer13Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer13Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer13DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer13Db' is required. Either set @Required to field 'phase2Answer13Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer14Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer14Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer14Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer14Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer14DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer14Db' is required. Either set @Required to field 'phase2Answer14Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer15Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer15Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer15Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer15Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer15DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer15Db' is required. Either set @Required to field 'phase2Answer15Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer16Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer16Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer16Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer16Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer16DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer16Db' is required. Either set @Required to field 'phase2Answer16Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer17Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer17Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer17Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer17Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer17DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer17Db' is required. Either set @Required to field 'phase2Answer17Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer18Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer18Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer18Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer18Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer18DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer18Db' is required. Either set @Required to field 'phase2Answer18Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer19Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer19Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer19Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer19Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer19DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer19Db' is required. Either set @Required to field 'phase2Answer19Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer20Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer20Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer20Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer20Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer20DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer20Db' is required. Either set @Required to field 'phase2Answer20Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer21Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer21Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer21Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer21Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer21DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer21Db' is required. Either set @Required to field 'phase2Answer21Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer22Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer22Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer22Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer22Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer22DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer22Db' is required. Either set @Required to field 'phase2Answer22Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer23Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer23Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer23Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer23Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer23DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer23Db' is required. Either set @Required to field 'phase2Answer23Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer24Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer24Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer24Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer24Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer24DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer24Db' is required. Either set @Required to field 'phase2Answer24Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer25Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer25Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer25Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer25Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer25DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer25Db' is required. Either set @Required to field 'phase2Answer25Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer26Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer26Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer26Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer26Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer26DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer26Db' is required. Either set @Required to field 'phase2Answer26Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer27Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer27Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer27Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer27Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer27DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer27Db' is required. Either set @Required to field 'phase2Answer27Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer28Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer28Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer28Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer28Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer28DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer28Db' is required. Either set @Required to field 'phase2Answer28Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer29Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer29Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer29Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer29Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer29DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer29Db' is required. Either set @Required to field 'phase2Answer29Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase2Answer30Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase2Answer30Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase2Answer30Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase2Answer30Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase2Answer30DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase2Answer30Db' is required. Either set @Required to field 'phase2Answer30Db' or migrate using RealmObjectSchema.setNullable().");
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
        final List<String> excludeFields = Collections.<String> emptyList();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db obj = null;
        if (update) {
            Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("phase2Id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("phase2Id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ActivityPhase2DbRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("phase2Id")) {
                if (json.isNull("phase2Id")) {
                    obj = (io.realm.ActivityPhase2DbRealmProxy) realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ActivityPhase2DbRealmProxy) realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class, json.getInt("phase2Id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'phase2Id'.");
            }
        }
        if (json.has("phase2Supervisor")) {
            if (json.isNull("phase2Supervisor")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Supervisor(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Supervisor((String) json.getString("phase2Supervisor"));
            }
        }
        if (json.has("phase2District")) {
            if (json.isNull("phase2District")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2District(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2District((String) json.getString("phase2District"));
            }
        }
        if (json.has("phase2Date")) {
            if (json.isNull("phase2Date")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Date(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Date((String) json.getString("phase2Date"));
            }
        }
        if (json.has("phase2Mother")) {
            if (json.isNull("phase2Mother")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Mother(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Mother((String) json.getString("phase2Mother"));
            }
        }
        if (json.has("phase2MotherAge")) {
            if (json.isNull("phase2MotherAge")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherAge(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherAge((String) json.getString("phase2MotherAge"));
            }
        }
        if (json.has("phase2MotherContact")) {
            if (json.isNull("phase2MotherContact")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherContact(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherContact((String) json.getString("phase2MotherContact"));
            }
        }
        if (json.has("phase2MotherAddress")) {
            if (json.isNull("phase2MotherAddress")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherAddress(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherAddress((String) json.getString("phase2MotherAddress"));
            }
        }
        if (json.has("phase2Answer1Db")) {
            if (json.isNull("phase2Answer1Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer1Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer1Db((String) json.getString("phase2Answer1Db"));
            }
        }
        if (json.has("phase2Answer2Db")) {
            if (json.isNull("phase2Answer2Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer2Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer2Db((String) json.getString("phase2Answer2Db"));
            }
        }
        if (json.has("phase2Answer3Db")) {
            if (json.isNull("phase2Answer3Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer3Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer3Db((String) json.getString("phase2Answer3Db"));
            }
        }
        if (json.has("phase2Answer4Db")) {
            if (json.isNull("phase2Answer4Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer4Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer4Db((String) json.getString("phase2Answer4Db"));
            }
        }
        if (json.has("phase2Answer5Db")) {
            if (json.isNull("phase2Answer5Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer5Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer5Db((String) json.getString("phase2Answer5Db"));
            }
        }
        if (json.has("phase2Answer6Db")) {
            if (json.isNull("phase2Answer6Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer6Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer6Db((String) json.getString("phase2Answer6Db"));
            }
        }
        if (json.has("phase2Answer7Db")) {
            if (json.isNull("phase2Answer7Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer7Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer7Db((String) json.getString("phase2Answer7Db"));
            }
        }
        if (json.has("phase2Answer8Db")) {
            if (json.isNull("phase2Answer8Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer8Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer8Db((String) json.getString("phase2Answer8Db"));
            }
        }
        if (json.has("phase2Answer9Db")) {
            if (json.isNull("phase2Answer9Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer9Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer9Db((String) json.getString("phase2Answer9Db"));
            }
        }
        if (json.has("phase2Answer10Db")) {
            if (json.isNull("phase2Answer10Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer10Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer10Db((String) json.getString("phase2Answer10Db"));
            }
        }
        if (json.has("phase2Answer11Db")) {
            if (json.isNull("phase2Answer11Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer11Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer11Db((String) json.getString("phase2Answer11Db"));
            }
        }
        if (json.has("phase2Answer12Db")) {
            if (json.isNull("phase2Answer12Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer12Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer12Db((String) json.getString("phase2Answer12Db"));
            }
        }
        if (json.has("phase2Answer13Db")) {
            if (json.isNull("phase2Answer13Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer13Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer13Db((String) json.getString("phase2Answer13Db"));
            }
        }
        if (json.has("phase2Answer14Db")) {
            if (json.isNull("phase2Answer14Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer14Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer14Db((String) json.getString("phase2Answer14Db"));
            }
        }
        if (json.has("phase2Answer15Db")) {
            if (json.isNull("phase2Answer15Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer15Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer15Db((String) json.getString("phase2Answer15Db"));
            }
        }
        if (json.has("phase2Answer16Db")) {
            if (json.isNull("phase2Answer16Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer16Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer16Db((String) json.getString("phase2Answer16Db"));
            }
        }
        if (json.has("phase2Answer17Db")) {
            if (json.isNull("phase2Answer17Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer17Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer17Db((String) json.getString("phase2Answer17Db"));
            }
        }
        if (json.has("phase2Answer18Db")) {
            if (json.isNull("phase2Answer18Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer18Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer18Db((String) json.getString("phase2Answer18Db"));
            }
        }
        if (json.has("phase2Answer19Db")) {
            if (json.isNull("phase2Answer19Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer19Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer19Db((String) json.getString("phase2Answer19Db"));
            }
        }
        if (json.has("phase2Answer20Db")) {
            if (json.isNull("phase2Answer20Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer20Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer20Db((String) json.getString("phase2Answer20Db"));
            }
        }
        if (json.has("phase2Answer21Db")) {
            if (json.isNull("phase2Answer21Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer21Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer21Db((String) json.getString("phase2Answer21Db"));
            }
        }
        if (json.has("phase2Answer22Db")) {
            if (json.isNull("phase2Answer22Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer22Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer22Db((String) json.getString("phase2Answer22Db"));
            }
        }
        if (json.has("phase2Answer23Db")) {
            if (json.isNull("phase2Answer23Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer23Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer23Db((String) json.getString("phase2Answer23Db"));
            }
        }
        if (json.has("phase2Answer24Db")) {
            if (json.isNull("phase2Answer24Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer24Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer24Db((String) json.getString("phase2Answer24Db"));
            }
        }
        if (json.has("phase2Answer25Db")) {
            if (json.isNull("phase2Answer25Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer25Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer25Db((String) json.getString("phase2Answer25Db"));
            }
        }
        if (json.has("phase2Answer26Db")) {
            if (json.isNull("phase2Answer26Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer26Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer26Db((String) json.getString("phase2Answer26Db"));
            }
        }
        if (json.has("phase2Answer27Db")) {
            if (json.isNull("phase2Answer27Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer27Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer27Db((String) json.getString("phase2Answer27Db"));
            }
        }
        if (json.has("phase2Answer28Db")) {
            if (json.isNull("phase2Answer28Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer28Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer28Db((String) json.getString("phase2Answer28Db"));
            }
        }
        if (json.has("phase2Answer29Db")) {
            if (json.isNull("phase2Answer29Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer29Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer29Db((String) json.getString("phase2Answer29Db"));
            }
        }
        if (json.has("phase2Answer30Db")) {
            if (json.isNull("phase2Answer30Db")) {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer30Db(null);
            } else {
                ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer30Db((String) json.getString("phase2Answer30Db"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db obj = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("phase2Id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'phase2Id' to null.");
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("phase2Supervisor")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Supervisor(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Supervisor((String) reader.nextString());
                }
            } else if (name.equals("phase2District")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2District(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2District((String) reader.nextString());
                }
            } else if (name.equals("phase2Date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Date(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Date((String) reader.nextString());
                }
            } else if (name.equals("phase2Mother")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Mother(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Mother((String) reader.nextString());
                }
            } else if (name.equals("phase2MotherAge")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherAge(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherAge((String) reader.nextString());
                }
            } else if (name.equals("phase2MotherContact")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherContact(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherContact((String) reader.nextString());
                }
            } else if (name.equals("phase2MotherAddress")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherAddress(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2MotherAddress((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer1Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer1Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer1Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer2Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer2Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer2Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer3Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer3Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer3Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer4Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer4Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer4Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer5Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer5Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer5Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer6Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer6Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer6Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer7Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer7Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer7Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer8Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer8Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer8Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer9Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer9Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer9Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer10Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer10Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer10Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer11Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer11Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer11Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer12Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer12Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer12Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer13Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer13Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer13Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer14Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer14Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer14Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer15Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer15Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer15Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer16Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer16Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer16Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer17Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer17Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer17Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer18Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer18Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer18Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer19Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer19Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer19Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer20Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer20Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer20Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer21Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer21Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer21Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer22Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer22Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer22Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer23Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer23Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer23Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer24Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer24Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer24Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer25Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer25Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer25Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer26Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer26Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer26Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer27Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer27Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer27Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer28Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer28Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer28Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer29Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer29Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer29Db((String) reader.nextString());
                }
            } else if (name.equals("phase2Answer30Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer30Db(null);
                } else {
                    ((ActivityPhase2DbRealmProxyInterface) obj).realmSet$phase2Answer30Db((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'phase2Id'.");
        }
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
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.ActivityPhase2DbRealmProxy();
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

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db copy(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db realmObject = realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class, ((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Supervisor(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Supervisor());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2District(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2District());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Date(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Date());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Mother(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Mother());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2MotherAge(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2MotherAge());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2MotherContact(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2MotherContact());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2MotherAddress(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2MotherAddress());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer1Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer1Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer2Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer2Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer3Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer3Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer4Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer4Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer5Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer5Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer6Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer6Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer7Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer7Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer8Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer8Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer9Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer9Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer10Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer10Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer11Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer11Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer12Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer12Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer13Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer13Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer14Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer14Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer15Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer15Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer16Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer16Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer17Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer17Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer18Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer18Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer19Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer19Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer20Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer20Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer21Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer21Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer22Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer22Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer23Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer23Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer24Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer24Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer25Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer25Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer26Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer26Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer27Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer27Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer28Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer28Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer29Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer29Db());
            ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer30Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer30Db());
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
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id(), false);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$phase2Supervisor = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Supervisor();
        if (realmGet$phase2Supervisor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2SupervisorIndex, rowIndex, realmGet$phase2Supervisor, false);
        }
        String realmGet$phase2District = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2District();
        if (realmGet$phase2District != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2DistrictIndex, rowIndex, realmGet$phase2District, false);
        }
        String realmGet$phase2Date = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Date();
        if (realmGet$phase2Date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2DateIndex, rowIndex, realmGet$phase2Date, false);
        }
        String realmGet$phase2Mother = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Mother();
        if (realmGet$phase2Mother != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherIndex, rowIndex, realmGet$phase2Mother, false);
        }
        String realmGet$phase2MotherAge = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherAge();
        if (realmGet$phase2MotherAge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherAgeIndex, rowIndex, realmGet$phase2MotherAge, false);
        }
        String realmGet$phase2MotherContact = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherContact();
        if (realmGet$phase2MotherContact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherContactIndex, rowIndex, realmGet$phase2MotherContact, false);
        }
        String realmGet$phase2MotherAddress = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherAddress();
        if (realmGet$phase2MotherAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherAddressIndex, rowIndex, realmGet$phase2MotherAddress, false);
        }
        String realmGet$phase2Answer1Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer1Db();
        if (realmGet$phase2Answer1Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer1DbIndex, rowIndex, realmGet$phase2Answer1Db, false);
        }
        String realmGet$phase2Answer2Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer2Db();
        if (realmGet$phase2Answer2Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer2DbIndex, rowIndex, realmGet$phase2Answer2Db, false);
        }
        String realmGet$phase2Answer3Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer3Db();
        if (realmGet$phase2Answer3Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer3DbIndex, rowIndex, realmGet$phase2Answer3Db, false);
        }
        String realmGet$phase2Answer4Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer4Db();
        if (realmGet$phase2Answer4Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer4DbIndex, rowIndex, realmGet$phase2Answer4Db, false);
        }
        String realmGet$phase2Answer5Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer5Db();
        if (realmGet$phase2Answer5Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer5DbIndex, rowIndex, realmGet$phase2Answer5Db, false);
        }
        String realmGet$phase2Answer6Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer6Db();
        if (realmGet$phase2Answer6Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer6DbIndex, rowIndex, realmGet$phase2Answer6Db, false);
        }
        String realmGet$phase2Answer7Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer7Db();
        if (realmGet$phase2Answer7Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer7DbIndex, rowIndex, realmGet$phase2Answer7Db, false);
        }
        String realmGet$phase2Answer8Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer8Db();
        if (realmGet$phase2Answer8Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer8DbIndex, rowIndex, realmGet$phase2Answer8Db, false);
        }
        String realmGet$phase2Answer9Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer9Db();
        if (realmGet$phase2Answer9Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer9DbIndex, rowIndex, realmGet$phase2Answer9Db, false);
        }
        String realmGet$phase2Answer10Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer10Db();
        if (realmGet$phase2Answer10Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer10DbIndex, rowIndex, realmGet$phase2Answer10Db, false);
        }
        String realmGet$phase2Answer11Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer11Db();
        if (realmGet$phase2Answer11Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer11DbIndex, rowIndex, realmGet$phase2Answer11Db, false);
        }
        String realmGet$phase2Answer12Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer12Db();
        if (realmGet$phase2Answer12Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer12DbIndex, rowIndex, realmGet$phase2Answer12Db, false);
        }
        String realmGet$phase2Answer13Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer13Db();
        if (realmGet$phase2Answer13Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer13DbIndex, rowIndex, realmGet$phase2Answer13Db, false);
        }
        String realmGet$phase2Answer14Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer14Db();
        if (realmGet$phase2Answer14Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer14DbIndex, rowIndex, realmGet$phase2Answer14Db, false);
        }
        String realmGet$phase2Answer15Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer15Db();
        if (realmGet$phase2Answer15Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer15DbIndex, rowIndex, realmGet$phase2Answer15Db, false);
        }
        String realmGet$phase2Answer16Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer16Db();
        if (realmGet$phase2Answer16Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer16DbIndex, rowIndex, realmGet$phase2Answer16Db, false);
        }
        String realmGet$phase2Answer17Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer17Db();
        if (realmGet$phase2Answer17Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer17DbIndex, rowIndex, realmGet$phase2Answer17Db, false);
        }
        String realmGet$phase2Answer18Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer18Db();
        if (realmGet$phase2Answer18Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer18DbIndex, rowIndex, realmGet$phase2Answer18Db, false);
        }
        String realmGet$phase2Answer19Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer19Db();
        if (realmGet$phase2Answer19Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer19DbIndex, rowIndex, realmGet$phase2Answer19Db, false);
        }
        String realmGet$phase2Answer20Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer20Db();
        if (realmGet$phase2Answer20Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer20DbIndex, rowIndex, realmGet$phase2Answer20Db, false);
        }
        String realmGet$phase2Answer21Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer21Db();
        if (realmGet$phase2Answer21Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer21DbIndex, rowIndex, realmGet$phase2Answer21Db, false);
        }
        String realmGet$phase2Answer22Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer22Db();
        if (realmGet$phase2Answer22Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer22DbIndex, rowIndex, realmGet$phase2Answer22Db, false);
        }
        String realmGet$phase2Answer23Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer23Db();
        if (realmGet$phase2Answer23Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer23DbIndex, rowIndex, realmGet$phase2Answer23Db, false);
        }
        String realmGet$phase2Answer24Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer24Db();
        if (realmGet$phase2Answer24Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer24DbIndex, rowIndex, realmGet$phase2Answer24Db, false);
        }
        String realmGet$phase2Answer25Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer25Db();
        if (realmGet$phase2Answer25Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer25DbIndex, rowIndex, realmGet$phase2Answer25Db, false);
        }
        String realmGet$phase2Answer26Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer26Db();
        if (realmGet$phase2Answer26Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer26DbIndex, rowIndex, realmGet$phase2Answer26Db, false);
        }
        String realmGet$phase2Answer27Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer27Db();
        if (realmGet$phase2Answer27Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer27DbIndex, rowIndex, realmGet$phase2Answer27Db, false);
        }
        String realmGet$phase2Answer28Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer28Db();
        if (realmGet$phase2Answer28Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer28DbIndex, rowIndex, realmGet$phase2Answer28Db, false);
        }
        String realmGet$phase2Answer29Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer29Db();
        if (realmGet$phase2Answer29Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer29DbIndex, rowIndex, realmGet$phase2Answer29Db, false);
        }
        String realmGet$phase2Answer30Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer30Db();
        if (realmGet$phase2Answer30Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer30DbIndex, rowIndex, realmGet$phase2Answer30Db, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase2DbColumnInfo columnInfo = (ActivityPhase2DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id(), false);
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$phase2Supervisor = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Supervisor();
                if (realmGet$phase2Supervisor != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2SupervisorIndex, rowIndex, realmGet$phase2Supervisor, false);
                }
                String realmGet$phase2District = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2District();
                if (realmGet$phase2District != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2DistrictIndex, rowIndex, realmGet$phase2District, false);
                }
                String realmGet$phase2Date = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Date();
                if (realmGet$phase2Date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2DateIndex, rowIndex, realmGet$phase2Date, false);
                }
                String realmGet$phase2Mother = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Mother();
                if (realmGet$phase2Mother != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherIndex, rowIndex, realmGet$phase2Mother, false);
                }
                String realmGet$phase2MotherAge = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherAge();
                if (realmGet$phase2MotherAge != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherAgeIndex, rowIndex, realmGet$phase2MotherAge, false);
                }
                String realmGet$phase2MotherContact = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherContact();
                if (realmGet$phase2MotherContact != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherContactIndex, rowIndex, realmGet$phase2MotherContact, false);
                }
                String realmGet$phase2MotherAddress = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherAddress();
                if (realmGet$phase2MotherAddress != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherAddressIndex, rowIndex, realmGet$phase2MotherAddress, false);
                }
                String realmGet$phase2Answer1Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer1Db();
                if (realmGet$phase2Answer1Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer1DbIndex, rowIndex, realmGet$phase2Answer1Db, false);
                }
                String realmGet$phase2Answer2Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer2Db();
                if (realmGet$phase2Answer2Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer2DbIndex, rowIndex, realmGet$phase2Answer2Db, false);
                }
                String realmGet$phase2Answer3Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer3Db();
                if (realmGet$phase2Answer3Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer3DbIndex, rowIndex, realmGet$phase2Answer3Db, false);
                }
                String realmGet$phase2Answer4Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer4Db();
                if (realmGet$phase2Answer4Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer4DbIndex, rowIndex, realmGet$phase2Answer4Db, false);
                }
                String realmGet$phase2Answer5Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer5Db();
                if (realmGet$phase2Answer5Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer5DbIndex, rowIndex, realmGet$phase2Answer5Db, false);
                }
                String realmGet$phase2Answer6Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer6Db();
                if (realmGet$phase2Answer6Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer6DbIndex, rowIndex, realmGet$phase2Answer6Db, false);
                }
                String realmGet$phase2Answer7Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer7Db();
                if (realmGet$phase2Answer7Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer7DbIndex, rowIndex, realmGet$phase2Answer7Db, false);
                }
                String realmGet$phase2Answer8Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer8Db();
                if (realmGet$phase2Answer8Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer8DbIndex, rowIndex, realmGet$phase2Answer8Db, false);
                }
                String realmGet$phase2Answer9Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer9Db();
                if (realmGet$phase2Answer9Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer9DbIndex, rowIndex, realmGet$phase2Answer9Db, false);
                }
                String realmGet$phase2Answer10Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer10Db();
                if (realmGet$phase2Answer10Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer10DbIndex, rowIndex, realmGet$phase2Answer10Db, false);
                }
                String realmGet$phase2Answer11Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer11Db();
                if (realmGet$phase2Answer11Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer11DbIndex, rowIndex, realmGet$phase2Answer11Db, false);
                }
                String realmGet$phase2Answer12Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer12Db();
                if (realmGet$phase2Answer12Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer12DbIndex, rowIndex, realmGet$phase2Answer12Db, false);
                }
                String realmGet$phase2Answer13Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer13Db();
                if (realmGet$phase2Answer13Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer13DbIndex, rowIndex, realmGet$phase2Answer13Db, false);
                }
                String realmGet$phase2Answer14Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer14Db();
                if (realmGet$phase2Answer14Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer14DbIndex, rowIndex, realmGet$phase2Answer14Db, false);
                }
                String realmGet$phase2Answer15Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer15Db();
                if (realmGet$phase2Answer15Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer15DbIndex, rowIndex, realmGet$phase2Answer15Db, false);
                }
                String realmGet$phase2Answer16Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer16Db();
                if (realmGet$phase2Answer16Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer16DbIndex, rowIndex, realmGet$phase2Answer16Db, false);
                }
                String realmGet$phase2Answer17Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer17Db();
                if (realmGet$phase2Answer17Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer17DbIndex, rowIndex, realmGet$phase2Answer17Db, false);
                }
                String realmGet$phase2Answer18Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer18Db();
                if (realmGet$phase2Answer18Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer18DbIndex, rowIndex, realmGet$phase2Answer18Db, false);
                }
                String realmGet$phase2Answer19Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer19Db();
                if (realmGet$phase2Answer19Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer19DbIndex, rowIndex, realmGet$phase2Answer19Db, false);
                }
                String realmGet$phase2Answer20Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer20Db();
                if (realmGet$phase2Answer20Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer20DbIndex, rowIndex, realmGet$phase2Answer20Db, false);
                }
                String realmGet$phase2Answer21Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer21Db();
                if (realmGet$phase2Answer21Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer21DbIndex, rowIndex, realmGet$phase2Answer21Db, false);
                }
                String realmGet$phase2Answer22Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer22Db();
                if (realmGet$phase2Answer22Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer22DbIndex, rowIndex, realmGet$phase2Answer22Db, false);
                }
                String realmGet$phase2Answer23Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer23Db();
                if (realmGet$phase2Answer23Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer23DbIndex, rowIndex, realmGet$phase2Answer23Db, false);
                }
                String realmGet$phase2Answer24Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer24Db();
                if (realmGet$phase2Answer24Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer24DbIndex, rowIndex, realmGet$phase2Answer24Db, false);
                }
                String realmGet$phase2Answer25Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer25Db();
                if (realmGet$phase2Answer25Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer25DbIndex, rowIndex, realmGet$phase2Answer25Db, false);
                }
                String realmGet$phase2Answer26Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer26Db();
                if (realmGet$phase2Answer26Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer26DbIndex, rowIndex, realmGet$phase2Answer26Db, false);
                }
                String realmGet$phase2Answer27Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer27Db();
                if (realmGet$phase2Answer27Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer27DbIndex, rowIndex, realmGet$phase2Answer27Db, false);
                }
                String realmGet$phase2Answer28Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer28Db();
                if (realmGet$phase2Answer28Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer28DbIndex, rowIndex, realmGet$phase2Answer28Db, false);
                }
                String realmGet$phase2Answer29Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer29Db();
                if (realmGet$phase2Answer29Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer29DbIndex, rowIndex, realmGet$phase2Answer29Db, false);
                }
                String realmGet$phase2Answer30Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer30Db();
                if (realmGet$phase2Answer30Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer30DbIndex, rowIndex, realmGet$phase2Answer30Db, false);
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
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id(), false);
        }
        cache.put(object, rowIndex);
        String realmGet$phase2Supervisor = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Supervisor();
        if (realmGet$phase2Supervisor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2SupervisorIndex, rowIndex, realmGet$phase2Supervisor, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2SupervisorIndex, rowIndex, false);
        }
        String realmGet$phase2District = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2District();
        if (realmGet$phase2District != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2DistrictIndex, rowIndex, realmGet$phase2District, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2DistrictIndex, rowIndex, false);
        }
        String realmGet$phase2Date = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Date();
        if (realmGet$phase2Date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2DateIndex, rowIndex, realmGet$phase2Date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2DateIndex, rowIndex, false);
        }
        String realmGet$phase2Mother = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Mother();
        if (realmGet$phase2Mother != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherIndex, rowIndex, realmGet$phase2Mother, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2MotherIndex, rowIndex, false);
        }
        String realmGet$phase2MotherAge = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherAge();
        if (realmGet$phase2MotherAge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherAgeIndex, rowIndex, realmGet$phase2MotherAge, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2MotherAgeIndex, rowIndex, false);
        }
        String realmGet$phase2MotherContact = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherContact();
        if (realmGet$phase2MotherContact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherContactIndex, rowIndex, realmGet$phase2MotherContact, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2MotherContactIndex, rowIndex, false);
        }
        String realmGet$phase2MotherAddress = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherAddress();
        if (realmGet$phase2MotherAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherAddressIndex, rowIndex, realmGet$phase2MotherAddress, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2MotherAddressIndex, rowIndex, false);
        }
        String realmGet$phase2Answer1Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer1Db();
        if (realmGet$phase2Answer1Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer1DbIndex, rowIndex, realmGet$phase2Answer1Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer1DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer2Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer2Db();
        if (realmGet$phase2Answer2Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer2DbIndex, rowIndex, realmGet$phase2Answer2Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer2DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer3Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer3Db();
        if (realmGet$phase2Answer3Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer3DbIndex, rowIndex, realmGet$phase2Answer3Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer3DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer4Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer4Db();
        if (realmGet$phase2Answer4Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer4DbIndex, rowIndex, realmGet$phase2Answer4Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer4DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer5Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer5Db();
        if (realmGet$phase2Answer5Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer5DbIndex, rowIndex, realmGet$phase2Answer5Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer5DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer6Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer6Db();
        if (realmGet$phase2Answer6Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer6DbIndex, rowIndex, realmGet$phase2Answer6Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer6DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer7Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer7Db();
        if (realmGet$phase2Answer7Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer7DbIndex, rowIndex, realmGet$phase2Answer7Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer7DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer8Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer8Db();
        if (realmGet$phase2Answer8Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer8DbIndex, rowIndex, realmGet$phase2Answer8Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer8DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer9Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer9Db();
        if (realmGet$phase2Answer9Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer9DbIndex, rowIndex, realmGet$phase2Answer9Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer9DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer10Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer10Db();
        if (realmGet$phase2Answer10Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer10DbIndex, rowIndex, realmGet$phase2Answer10Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer10DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer11Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer11Db();
        if (realmGet$phase2Answer11Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer11DbIndex, rowIndex, realmGet$phase2Answer11Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer11DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer12Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer12Db();
        if (realmGet$phase2Answer12Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer12DbIndex, rowIndex, realmGet$phase2Answer12Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer12DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer13Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer13Db();
        if (realmGet$phase2Answer13Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer13DbIndex, rowIndex, realmGet$phase2Answer13Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer13DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer14Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer14Db();
        if (realmGet$phase2Answer14Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer14DbIndex, rowIndex, realmGet$phase2Answer14Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer14DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer15Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer15Db();
        if (realmGet$phase2Answer15Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer15DbIndex, rowIndex, realmGet$phase2Answer15Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer15DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer16Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer16Db();
        if (realmGet$phase2Answer16Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer16DbIndex, rowIndex, realmGet$phase2Answer16Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer16DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer17Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer17Db();
        if (realmGet$phase2Answer17Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer17DbIndex, rowIndex, realmGet$phase2Answer17Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer17DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer18Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer18Db();
        if (realmGet$phase2Answer18Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer18DbIndex, rowIndex, realmGet$phase2Answer18Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer18DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer19Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer19Db();
        if (realmGet$phase2Answer19Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer19DbIndex, rowIndex, realmGet$phase2Answer19Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer19DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer20Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer20Db();
        if (realmGet$phase2Answer20Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer20DbIndex, rowIndex, realmGet$phase2Answer20Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer20DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer21Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer21Db();
        if (realmGet$phase2Answer21Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer21DbIndex, rowIndex, realmGet$phase2Answer21Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer21DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer22Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer22Db();
        if (realmGet$phase2Answer22Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer22DbIndex, rowIndex, realmGet$phase2Answer22Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer22DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer23Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer23Db();
        if (realmGet$phase2Answer23Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer23DbIndex, rowIndex, realmGet$phase2Answer23Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer23DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer24Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer24Db();
        if (realmGet$phase2Answer24Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer24DbIndex, rowIndex, realmGet$phase2Answer24Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer24DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer25Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer25Db();
        if (realmGet$phase2Answer25Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer25DbIndex, rowIndex, realmGet$phase2Answer25Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer25DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer26Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer26Db();
        if (realmGet$phase2Answer26Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer26DbIndex, rowIndex, realmGet$phase2Answer26Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer26DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer27Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer27Db();
        if (realmGet$phase2Answer27Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer27DbIndex, rowIndex, realmGet$phase2Answer27Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer27DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer28Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer28Db();
        if (realmGet$phase2Answer28Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer28DbIndex, rowIndex, realmGet$phase2Answer28Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer28DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer29Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer29Db();
        if (realmGet$phase2Answer29Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer29DbIndex, rowIndex, realmGet$phase2Answer29Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer29DbIndex, rowIndex, false);
        }
        String realmGet$phase2Answer30Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer30Db();
        if (realmGet$phase2Answer30Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer30DbIndex, rowIndex, realmGet$phase2Answer30Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer30DbIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase2DbColumnInfo columnInfo = (ActivityPhase2DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase2DbRealmProxyInterface) object).realmGet$phase2Id(), false);
                }
                cache.put(object, rowIndex);
                String realmGet$phase2Supervisor = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Supervisor();
                if (realmGet$phase2Supervisor != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2SupervisorIndex, rowIndex, realmGet$phase2Supervisor, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2SupervisorIndex, rowIndex, false);
                }
                String realmGet$phase2District = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2District();
                if (realmGet$phase2District != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2DistrictIndex, rowIndex, realmGet$phase2District, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2DistrictIndex, rowIndex, false);
                }
                String realmGet$phase2Date = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Date();
                if (realmGet$phase2Date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2DateIndex, rowIndex, realmGet$phase2Date, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2DateIndex, rowIndex, false);
                }
                String realmGet$phase2Mother = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Mother();
                if (realmGet$phase2Mother != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherIndex, rowIndex, realmGet$phase2Mother, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2MotherIndex, rowIndex, false);
                }
                String realmGet$phase2MotherAge = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherAge();
                if (realmGet$phase2MotherAge != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherAgeIndex, rowIndex, realmGet$phase2MotherAge, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2MotherAgeIndex, rowIndex, false);
                }
                String realmGet$phase2MotherContact = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherContact();
                if (realmGet$phase2MotherContact != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherContactIndex, rowIndex, realmGet$phase2MotherContact, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2MotherContactIndex, rowIndex, false);
                }
                String realmGet$phase2MotherAddress = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2MotherAddress();
                if (realmGet$phase2MotherAddress != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2MotherAddressIndex, rowIndex, realmGet$phase2MotherAddress, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2MotherAddressIndex, rowIndex, false);
                }
                String realmGet$phase2Answer1Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer1Db();
                if (realmGet$phase2Answer1Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer1DbIndex, rowIndex, realmGet$phase2Answer1Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer1DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer2Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer2Db();
                if (realmGet$phase2Answer2Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer2DbIndex, rowIndex, realmGet$phase2Answer2Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer2DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer3Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer3Db();
                if (realmGet$phase2Answer3Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer3DbIndex, rowIndex, realmGet$phase2Answer3Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer3DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer4Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer4Db();
                if (realmGet$phase2Answer4Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer4DbIndex, rowIndex, realmGet$phase2Answer4Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer4DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer5Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer5Db();
                if (realmGet$phase2Answer5Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer5DbIndex, rowIndex, realmGet$phase2Answer5Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer5DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer6Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer6Db();
                if (realmGet$phase2Answer6Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer6DbIndex, rowIndex, realmGet$phase2Answer6Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer6DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer7Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer7Db();
                if (realmGet$phase2Answer7Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer7DbIndex, rowIndex, realmGet$phase2Answer7Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer7DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer8Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer8Db();
                if (realmGet$phase2Answer8Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer8DbIndex, rowIndex, realmGet$phase2Answer8Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer8DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer9Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer9Db();
                if (realmGet$phase2Answer9Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer9DbIndex, rowIndex, realmGet$phase2Answer9Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer9DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer10Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer10Db();
                if (realmGet$phase2Answer10Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer10DbIndex, rowIndex, realmGet$phase2Answer10Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer10DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer11Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer11Db();
                if (realmGet$phase2Answer11Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer11DbIndex, rowIndex, realmGet$phase2Answer11Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer11DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer12Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer12Db();
                if (realmGet$phase2Answer12Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer12DbIndex, rowIndex, realmGet$phase2Answer12Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer12DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer13Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer13Db();
                if (realmGet$phase2Answer13Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer13DbIndex, rowIndex, realmGet$phase2Answer13Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer13DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer14Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer14Db();
                if (realmGet$phase2Answer14Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer14DbIndex, rowIndex, realmGet$phase2Answer14Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer14DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer15Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer15Db();
                if (realmGet$phase2Answer15Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer15DbIndex, rowIndex, realmGet$phase2Answer15Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer15DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer16Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer16Db();
                if (realmGet$phase2Answer16Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer16DbIndex, rowIndex, realmGet$phase2Answer16Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer16DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer17Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer17Db();
                if (realmGet$phase2Answer17Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer17DbIndex, rowIndex, realmGet$phase2Answer17Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer17DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer18Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer18Db();
                if (realmGet$phase2Answer18Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer18DbIndex, rowIndex, realmGet$phase2Answer18Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer18DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer19Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer19Db();
                if (realmGet$phase2Answer19Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer19DbIndex, rowIndex, realmGet$phase2Answer19Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer19DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer20Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer20Db();
                if (realmGet$phase2Answer20Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer20DbIndex, rowIndex, realmGet$phase2Answer20Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer20DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer21Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer21Db();
                if (realmGet$phase2Answer21Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer21DbIndex, rowIndex, realmGet$phase2Answer21Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer21DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer22Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer22Db();
                if (realmGet$phase2Answer22Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer22DbIndex, rowIndex, realmGet$phase2Answer22Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer22DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer23Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer23Db();
                if (realmGet$phase2Answer23Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer23DbIndex, rowIndex, realmGet$phase2Answer23Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer23DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer24Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer24Db();
                if (realmGet$phase2Answer24Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer24DbIndex, rowIndex, realmGet$phase2Answer24Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer24DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer25Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer25Db();
                if (realmGet$phase2Answer25Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer25DbIndex, rowIndex, realmGet$phase2Answer25Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer25DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer26Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer26Db();
                if (realmGet$phase2Answer26Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer26DbIndex, rowIndex, realmGet$phase2Answer26Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer26DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer27Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer27Db();
                if (realmGet$phase2Answer27Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer27DbIndex, rowIndex, realmGet$phase2Answer27Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer27DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer28Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer28Db();
                if (realmGet$phase2Answer28Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer28DbIndex, rowIndex, realmGet$phase2Answer28Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer28DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer29Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer29Db();
                if (realmGet$phase2Answer29Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer29DbIndex, rowIndex, realmGet$phase2Answer29Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer29DbIndex, rowIndex, false);
                }
                String realmGet$phase2Answer30Db = ((ActivityPhase2DbRealmProxyInterface)object).realmGet$phase2Answer30Db();
                if (realmGet$phase2Answer30Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase2Answer30DbIndex, rowIndex, realmGet$phase2Answer30Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase2Answer30DbIndex, rowIndex, false);
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
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Id(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Id());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Supervisor(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Supervisor());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2District(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2District());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Date(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Date());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Mother(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Mother());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2MotherAge(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2MotherAge());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2MotherContact(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2MotherContact());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2MotherAddress(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2MotherAddress());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer1Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer1Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer2Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer2Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer3Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer3Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer4Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer4Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer5Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer5Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer6Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer6Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer7Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer7Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer8Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer8Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer9Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer9Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer10Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer10Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer11Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer11Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer12Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer12Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer13Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer13Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer14Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer14Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer15Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer15Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer16Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer16Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer17Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer17Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer18Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer18Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer19Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer19Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer20Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer20Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer21Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer21Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer22Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer22Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer23Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer23Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer24Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer24Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer25Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer25Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer26Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer26Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer27Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer27Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer28Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer28Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer29Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer29Db());
        ((ActivityPhase2DbRealmProxyInterface) unmanagedObject).realmSet$phase2Answer30Db(((ActivityPhase2DbRealmProxyInterface) realmObject).realmGet$phase2Answer30Db());
        return unmanagedObject;
    }

    static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db update(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db realmObject, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase2Db newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Supervisor(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Supervisor());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2District(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2District());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Date(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Date());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Mother(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Mother());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2MotherAge(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2MotherAge());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2MotherContact(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2MotherContact());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2MotherAddress(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2MotherAddress());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer1Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer1Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer2Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer2Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer3Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer3Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer4Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer4Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer5Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer5Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer6Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer6Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer7Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer7Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer8Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer8Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer9Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer9Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer10Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer10Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer11Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer11Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer12Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer12Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer13Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer13Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer14Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer14Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer15Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer15Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer16Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer16Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer17Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer17Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer18Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer18Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer19Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer19Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer20Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer20Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer21Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer21Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer22Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer22Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer23Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer23Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer24Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer24Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer25Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer25Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer26Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer26Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer27Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer27Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer28Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer28Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer29Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer29Db());
        ((ActivityPhase2DbRealmProxyInterface) realmObject).realmSet$phase2Answer30Db(((ActivityPhase2DbRealmProxyInterface) newObject).realmGet$phase2Answer30Db());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ActivityPhase2Db = [");
        stringBuilder.append("{phase2Id:");
        stringBuilder.append(realmGet$phase2Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Supervisor:");
        stringBuilder.append(realmGet$phase2Supervisor() != null ? realmGet$phase2Supervisor() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2District:");
        stringBuilder.append(realmGet$phase2District() != null ? realmGet$phase2District() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Date:");
        stringBuilder.append(realmGet$phase2Date() != null ? realmGet$phase2Date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Mother:");
        stringBuilder.append(realmGet$phase2Mother() != null ? realmGet$phase2Mother() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2MotherAge:");
        stringBuilder.append(realmGet$phase2MotherAge() != null ? realmGet$phase2MotherAge() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2MotherContact:");
        stringBuilder.append(realmGet$phase2MotherContact() != null ? realmGet$phase2MotherContact() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2MotherAddress:");
        stringBuilder.append(realmGet$phase2MotherAddress() != null ? realmGet$phase2MotherAddress() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer1Db:");
        stringBuilder.append(realmGet$phase2Answer1Db() != null ? realmGet$phase2Answer1Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer2Db:");
        stringBuilder.append(realmGet$phase2Answer2Db() != null ? realmGet$phase2Answer2Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer3Db:");
        stringBuilder.append(realmGet$phase2Answer3Db() != null ? realmGet$phase2Answer3Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer4Db:");
        stringBuilder.append(realmGet$phase2Answer4Db() != null ? realmGet$phase2Answer4Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer5Db:");
        stringBuilder.append(realmGet$phase2Answer5Db() != null ? realmGet$phase2Answer5Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer6Db:");
        stringBuilder.append(realmGet$phase2Answer6Db() != null ? realmGet$phase2Answer6Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer7Db:");
        stringBuilder.append(realmGet$phase2Answer7Db() != null ? realmGet$phase2Answer7Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer8Db:");
        stringBuilder.append(realmGet$phase2Answer8Db() != null ? realmGet$phase2Answer8Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer9Db:");
        stringBuilder.append(realmGet$phase2Answer9Db() != null ? realmGet$phase2Answer9Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer10Db:");
        stringBuilder.append(realmGet$phase2Answer10Db() != null ? realmGet$phase2Answer10Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer11Db:");
        stringBuilder.append(realmGet$phase2Answer11Db() != null ? realmGet$phase2Answer11Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer12Db:");
        stringBuilder.append(realmGet$phase2Answer12Db() != null ? realmGet$phase2Answer12Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer13Db:");
        stringBuilder.append(realmGet$phase2Answer13Db() != null ? realmGet$phase2Answer13Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer14Db:");
        stringBuilder.append(realmGet$phase2Answer14Db() != null ? realmGet$phase2Answer14Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer15Db:");
        stringBuilder.append(realmGet$phase2Answer15Db() != null ? realmGet$phase2Answer15Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer16Db:");
        stringBuilder.append(realmGet$phase2Answer16Db() != null ? realmGet$phase2Answer16Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer17Db:");
        stringBuilder.append(realmGet$phase2Answer17Db() != null ? realmGet$phase2Answer17Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer18Db:");
        stringBuilder.append(realmGet$phase2Answer18Db() != null ? realmGet$phase2Answer18Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer19Db:");
        stringBuilder.append(realmGet$phase2Answer19Db() != null ? realmGet$phase2Answer19Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer20Db:");
        stringBuilder.append(realmGet$phase2Answer20Db() != null ? realmGet$phase2Answer20Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer21Db:");
        stringBuilder.append(realmGet$phase2Answer21Db() != null ? realmGet$phase2Answer21Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer22Db:");
        stringBuilder.append(realmGet$phase2Answer22Db() != null ? realmGet$phase2Answer22Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer23Db:");
        stringBuilder.append(realmGet$phase2Answer23Db() != null ? realmGet$phase2Answer23Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer24Db:");
        stringBuilder.append(realmGet$phase2Answer24Db() != null ? realmGet$phase2Answer24Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer25Db:");
        stringBuilder.append(realmGet$phase2Answer25Db() != null ? realmGet$phase2Answer25Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer26Db:");
        stringBuilder.append(realmGet$phase2Answer26Db() != null ? realmGet$phase2Answer26Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer27Db:");
        stringBuilder.append(realmGet$phase2Answer27Db() != null ? realmGet$phase2Answer27Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer28Db:");
        stringBuilder.append(realmGet$phase2Answer28Db() != null ? realmGet$phase2Answer28Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer29Db:");
        stringBuilder.append(realmGet$phase2Answer29Db() != null ? realmGet$phase2Answer29Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase2Answer30Db:");
        stringBuilder.append(realmGet$phase2Answer30Db() != null ? realmGet$phase2Answer30Db() : "null");
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
