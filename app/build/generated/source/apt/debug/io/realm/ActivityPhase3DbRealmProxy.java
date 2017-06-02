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

public class ActivityPhase3DbRealmProxy extends mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db
    implements RealmObjectProxy, ActivityPhase3DbRealmProxyInterface {

    static final class ActivityPhase3DbColumnInfo extends ColumnInfo
        implements Cloneable {

        public long phase3IdIndex;
        public long phase3SupervisorIndex;
        public long phase3DistrictIndex;
        public long phase3DateIndex;
        public long phase3MotherIndex;
        public long phase3MotherAgeIndex;
        public long phase3MotherContactIndex;
        public long phase3MotherAddressIndex;
        public long phase3Answer1DbIndex;
        public long phase3Answer2DbIndex;
        public long phase3Answer3DbIndex;
        public long phase3Answer4DbIndex;
        public long phase3Answer5DbIndex;
        public long phase3Answer6DbIndex;
        public long phase3Answer7DbIndex;
        public long phase3Answer8DbIndex;
        public long phase3Answer9DbIndex;
        public long phase3Answer10DbIndex;
        public long phase3Answer11DbIndex;
        public long phase3Answer12DbIndex;
        public long phase3Answer13DbIndex;
        public long phase3Answer14DbIndex;
        public long phase3Answer15DbIndex;
        public long phase3Answer16DbIndex;
        public long phase3Answer17DbIndex;
        public long phase3Answer18DbIndex;
        public long phase3Answer19DbIndex;
        public long phase3Answer20DbIndex;
        public long phase3Answer21DbIndex;
        public long phase3Answer22DbIndex;

        ActivityPhase3DbColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(30);
            this.phase3IdIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Id");
            indicesMap.put("phase3Id", this.phase3IdIndex);
            this.phase3SupervisorIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Supervisor");
            indicesMap.put("phase3Supervisor", this.phase3SupervisorIndex);
            this.phase3DistrictIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3District");
            indicesMap.put("phase3District", this.phase3DistrictIndex);
            this.phase3DateIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Date");
            indicesMap.put("phase3Date", this.phase3DateIndex);
            this.phase3MotherIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Mother");
            indicesMap.put("phase3Mother", this.phase3MotherIndex);
            this.phase3MotherAgeIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3MotherAge");
            indicesMap.put("phase3MotherAge", this.phase3MotherAgeIndex);
            this.phase3MotherContactIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3MotherContact");
            indicesMap.put("phase3MotherContact", this.phase3MotherContactIndex);
            this.phase3MotherAddressIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3MotherAddress");
            indicesMap.put("phase3MotherAddress", this.phase3MotherAddressIndex);
            this.phase3Answer1DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer1Db");
            indicesMap.put("phase3Answer1Db", this.phase3Answer1DbIndex);
            this.phase3Answer2DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer2Db");
            indicesMap.put("phase3Answer2Db", this.phase3Answer2DbIndex);
            this.phase3Answer3DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer3Db");
            indicesMap.put("phase3Answer3Db", this.phase3Answer3DbIndex);
            this.phase3Answer4DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer4Db");
            indicesMap.put("phase3Answer4Db", this.phase3Answer4DbIndex);
            this.phase3Answer5DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer5Db");
            indicesMap.put("phase3Answer5Db", this.phase3Answer5DbIndex);
            this.phase3Answer6DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer6Db");
            indicesMap.put("phase3Answer6Db", this.phase3Answer6DbIndex);
            this.phase3Answer7DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer7Db");
            indicesMap.put("phase3Answer7Db", this.phase3Answer7DbIndex);
            this.phase3Answer8DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer8Db");
            indicesMap.put("phase3Answer8Db", this.phase3Answer8DbIndex);
            this.phase3Answer9DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer9Db");
            indicesMap.put("phase3Answer9Db", this.phase3Answer9DbIndex);
            this.phase3Answer10DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer10Db");
            indicesMap.put("phase3Answer10Db", this.phase3Answer10DbIndex);
            this.phase3Answer11DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer11Db");
            indicesMap.put("phase3Answer11Db", this.phase3Answer11DbIndex);
            this.phase3Answer12DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer12Db");
            indicesMap.put("phase3Answer12Db", this.phase3Answer12DbIndex);
            this.phase3Answer13DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer13Db");
            indicesMap.put("phase3Answer13Db", this.phase3Answer13DbIndex);
            this.phase3Answer14DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer14Db");
            indicesMap.put("phase3Answer14Db", this.phase3Answer14DbIndex);
            this.phase3Answer15DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer15Db");
            indicesMap.put("phase3Answer15Db", this.phase3Answer15DbIndex);
            this.phase3Answer16DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer16Db");
            indicesMap.put("phase3Answer16Db", this.phase3Answer16DbIndex);
            this.phase3Answer17DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer17Db");
            indicesMap.put("phase3Answer17Db", this.phase3Answer17DbIndex);
            this.phase3Answer18DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer18Db");
            indicesMap.put("phase3Answer18Db", this.phase3Answer18DbIndex);
            this.phase3Answer19DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer19Db");
            indicesMap.put("phase3Answer19Db", this.phase3Answer19DbIndex);
            this.phase3Answer20DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer20Db");
            indicesMap.put("phase3Answer20Db", this.phase3Answer20DbIndex);
            this.phase3Answer21DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer21Db");
            indicesMap.put("phase3Answer21Db", this.phase3Answer21DbIndex);
            this.phase3Answer22DbIndex = getValidColumnIndex(path, table, "ActivityPhase3Db", "phase3Answer22Db");
            indicesMap.put("phase3Answer22Db", this.phase3Answer22DbIndex);

            setIndicesMap(indicesMap);
        }

        @Override
        public final void copyColumnInfoFrom(ColumnInfo other) {
            final ActivityPhase3DbColumnInfo otherInfo = (ActivityPhase3DbColumnInfo) other;
            this.phase3IdIndex = otherInfo.phase3IdIndex;
            this.phase3SupervisorIndex = otherInfo.phase3SupervisorIndex;
            this.phase3DistrictIndex = otherInfo.phase3DistrictIndex;
            this.phase3DateIndex = otherInfo.phase3DateIndex;
            this.phase3MotherIndex = otherInfo.phase3MotherIndex;
            this.phase3MotherAgeIndex = otherInfo.phase3MotherAgeIndex;
            this.phase3MotherContactIndex = otherInfo.phase3MotherContactIndex;
            this.phase3MotherAddressIndex = otherInfo.phase3MotherAddressIndex;
            this.phase3Answer1DbIndex = otherInfo.phase3Answer1DbIndex;
            this.phase3Answer2DbIndex = otherInfo.phase3Answer2DbIndex;
            this.phase3Answer3DbIndex = otherInfo.phase3Answer3DbIndex;
            this.phase3Answer4DbIndex = otherInfo.phase3Answer4DbIndex;
            this.phase3Answer5DbIndex = otherInfo.phase3Answer5DbIndex;
            this.phase3Answer6DbIndex = otherInfo.phase3Answer6DbIndex;
            this.phase3Answer7DbIndex = otherInfo.phase3Answer7DbIndex;
            this.phase3Answer8DbIndex = otherInfo.phase3Answer8DbIndex;
            this.phase3Answer9DbIndex = otherInfo.phase3Answer9DbIndex;
            this.phase3Answer10DbIndex = otherInfo.phase3Answer10DbIndex;
            this.phase3Answer11DbIndex = otherInfo.phase3Answer11DbIndex;
            this.phase3Answer12DbIndex = otherInfo.phase3Answer12DbIndex;
            this.phase3Answer13DbIndex = otherInfo.phase3Answer13DbIndex;
            this.phase3Answer14DbIndex = otherInfo.phase3Answer14DbIndex;
            this.phase3Answer15DbIndex = otherInfo.phase3Answer15DbIndex;
            this.phase3Answer16DbIndex = otherInfo.phase3Answer16DbIndex;
            this.phase3Answer17DbIndex = otherInfo.phase3Answer17DbIndex;
            this.phase3Answer18DbIndex = otherInfo.phase3Answer18DbIndex;
            this.phase3Answer19DbIndex = otherInfo.phase3Answer19DbIndex;
            this.phase3Answer20DbIndex = otherInfo.phase3Answer20DbIndex;
            this.phase3Answer21DbIndex = otherInfo.phase3Answer21DbIndex;
            this.phase3Answer22DbIndex = otherInfo.phase3Answer22DbIndex;

            setIndicesMap(otherInfo.getIndicesMap());
        }

        @Override
        public final ActivityPhase3DbColumnInfo clone() {
            return (ActivityPhase3DbColumnInfo) super.clone();
        }

    }
    private ActivityPhase3DbColumnInfo columnInfo;
    private ProxyState proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("phase3Id");
        fieldNames.add("phase3Supervisor");
        fieldNames.add("phase3District");
        fieldNames.add("phase3Date");
        fieldNames.add("phase3Mother");
        fieldNames.add("phase3MotherAge");
        fieldNames.add("phase3MotherContact");
        fieldNames.add("phase3MotherAddress");
        fieldNames.add("phase3Answer1Db");
        fieldNames.add("phase3Answer2Db");
        fieldNames.add("phase3Answer3Db");
        fieldNames.add("phase3Answer4Db");
        fieldNames.add("phase3Answer5Db");
        fieldNames.add("phase3Answer6Db");
        fieldNames.add("phase3Answer7Db");
        fieldNames.add("phase3Answer8Db");
        fieldNames.add("phase3Answer9Db");
        fieldNames.add("phase3Answer10Db");
        fieldNames.add("phase3Answer11Db");
        fieldNames.add("phase3Answer12Db");
        fieldNames.add("phase3Answer13Db");
        fieldNames.add("phase3Answer14Db");
        fieldNames.add("phase3Answer15Db");
        fieldNames.add("phase3Answer16Db");
        fieldNames.add("phase3Answer17Db");
        fieldNames.add("phase3Answer18Db");
        fieldNames.add("phase3Answer19Db");
        fieldNames.add("phase3Answer20Db");
        fieldNames.add("phase3Answer21Db");
        fieldNames.add("phase3Answer22Db");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ActivityPhase3DbRealmProxy() {
        if (proxyState == null) {
            injectObjectContext();
        }
        proxyState.setConstructionFinished();
    }

    private void injectObjectContext() {
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ActivityPhase3DbColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class, this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @SuppressWarnings("cast")
    public int realmGet$phase3Id() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.phase3IdIndex);
    }

    public void realmSet$phase3Id(int value) {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'phase3Id' cannot be changed after object was created.");
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Supervisor() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3SupervisorIndex);
    }

    public void realmSet$phase3Supervisor(String value) {
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
                row.getTable().setNull(columnInfo.phase3SupervisorIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3SupervisorIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3SupervisorIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3SupervisorIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3District() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3DistrictIndex);
    }

    public void realmSet$phase3District(String value) {
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
                row.getTable().setNull(columnInfo.phase3DistrictIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3DistrictIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3DistrictIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3DistrictIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Date() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3DateIndex);
    }

    public void realmSet$phase3Date(String value) {
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
                row.getTable().setNull(columnInfo.phase3DateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3DateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3DateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3DateIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Mother() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3MotherIndex);
    }

    public void realmSet$phase3Mother(String value) {
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
                row.getTable().setNull(columnInfo.phase3MotherIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3MotherIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3MotherIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3MotherIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3MotherAge() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3MotherAgeIndex);
    }

    public void realmSet$phase3MotherAge(String value) {
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
                row.getTable().setNull(columnInfo.phase3MotherAgeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3MotherAgeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3MotherAgeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3MotherAgeIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3MotherContact() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3MotherContactIndex);
    }

    public void realmSet$phase3MotherContact(String value) {
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
                row.getTable().setNull(columnInfo.phase3MotherContactIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3MotherContactIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3MotherContactIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3MotherContactIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3MotherAddress() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3MotherAddressIndex);
    }

    public void realmSet$phase3MotherAddress(String value) {
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
                row.getTable().setNull(columnInfo.phase3MotherAddressIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3MotherAddressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3MotherAddressIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3MotherAddressIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer1Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer1DbIndex);
    }

    public void realmSet$phase3Answer1Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer1DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer1DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer1DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer1DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer2Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer2DbIndex);
    }

    public void realmSet$phase3Answer2Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer2DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer2DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer2DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer2DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer3Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer3DbIndex);
    }

    public void realmSet$phase3Answer3Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer3DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer3DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer3DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer3DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer4Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer4DbIndex);
    }

    public void realmSet$phase3Answer4Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer4DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer4DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer4DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer4DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer5Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer5DbIndex);
    }

    public void realmSet$phase3Answer5Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer5DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer5DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer5DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer5DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer6Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer6DbIndex);
    }

    public void realmSet$phase3Answer6Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer6DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer6DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer6DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer6DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer7Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer7DbIndex);
    }

    public void realmSet$phase3Answer7Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer7DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer7DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer7DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer7DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer8Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer8DbIndex);
    }

    public void realmSet$phase3Answer8Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer8DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer8DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer8DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer8DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer9Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer9DbIndex);
    }

    public void realmSet$phase3Answer9Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer9DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer9DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer9DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer9DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer10Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer10DbIndex);
    }

    public void realmSet$phase3Answer10Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer10DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer10DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer10DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer10DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer11Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer11DbIndex);
    }

    public void realmSet$phase3Answer11Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer11DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer11DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer11DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer11DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer12Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer12DbIndex);
    }

    public void realmSet$phase3Answer12Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer12DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer12DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer12DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer12DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer13Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer13DbIndex);
    }

    public void realmSet$phase3Answer13Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer13DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer13DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer13DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer13DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer14Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer14DbIndex);
    }

    public void realmSet$phase3Answer14Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer14DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer14DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer14DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer14DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer15Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer15DbIndex);
    }

    public void realmSet$phase3Answer15Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer15DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer15DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer15DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer15DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer16Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer16DbIndex);
    }

    public void realmSet$phase3Answer16Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer16DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer16DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer16DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer16DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer17Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer17DbIndex);
    }

    public void realmSet$phase3Answer17Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer17DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer17DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer17DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer17DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer18Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer18DbIndex);
    }

    public void realmSet$phase3Answer18Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer18DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer18DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer18DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer18DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer19Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer19DbIndex);
    }

    public void realmSet$phase3Answer19Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer19DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer19DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer19DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer19DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer20Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer20DbIndex);
    }

    public void realmSet$phase3Answer20Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer20DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer20DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer20DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer20DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer21Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer21DbIndex);
    }

    public void realmSet$phase3Answer21Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer21DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer21DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer21DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer21DbIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$phase3Answer22Db() {
        if (proxyState == null) {
            // Called from model's constructor. Inject context.
            injectObjectContext();
        }

        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phase3Answer22DbIndex);
    }

    public void realmSet$phase3Answer22Db(String value) {
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
                row.getTable().setNull(columnInfo.phase3Answer22DbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phase3Answer22DbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phase3Answer22DbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phase3Answer22DbIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("ActivityPhase3Db")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("ActivityPhase3Db");
            realmObjectSchema.add(new Property("phase3Id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Supervisor", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3District", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Mother", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3MotherAge", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3MotherContact", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3MotherAddress", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer1Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer2Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer3Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer4Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer5Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer6Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer7Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer8Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer9Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer10Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer11Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer12Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer13Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer14Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer15Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer16Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer17Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer18Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer19Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer20Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer21Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            realmObjectSchema.add(new Property("phase3Answer22Db", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED));
            return realmObjectSchema;
        }
        return realmSchema.get("ActivityPhase3Db");
    }

    public static Table initTable(SharedRealm sharedRealm) {
        if (!sharedRealm.hasTable("class_ActivityPhase3Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase3Db");
            table.addColumn(RealmFieldType.INTEGER, "phase3Id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Supervisor", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3District", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Date", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Mother", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3MotherAge", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3MotherContact", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3MotherAddress", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer1Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer2Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer3Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer4Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer5Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer6Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer7Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer8Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer9Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer10Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer11Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer12Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer13Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer14Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer15Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer16Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer17Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer18Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer19Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer20Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer21Db", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "phase3Answer22Db", Table.NULLABLE);
            table.addSearchIndex(table.getColumnIndex("phase3Id"));
            table.setPrimaryKey("phase3Id");
            return table;
        }
        return sharedRealm.getTable("class_ActivityPhase3Db");
    }

    public static ActivityPhase3DbColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (sharedRealm.hasTable("class_ActivityPhase3Db")) {
            Table table = sharedRealm.getTable("class_ActivityPhase3Db");
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

            final ActivityPhase3DbColumnInfo columnInfo = new ActivityPhase3DbColumnInfo(sharedRealm.getPath(), table);

            if (!columnTypes.containsKey("phase3Id")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Id") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'phase3Id' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.phase3IdIndex) && table.findFirstNull(columnInfo.phase3IdIndex) != TableOrView.NO_MATCH) {
                throw new IllegalStateException("Cannot migrate an object with null value in field 'phase3Id'. Either maintain the same type for primary key field 'phase3Id', or remove the object with null value before migration.");
            }
            if (table.getPrimaryKey() != table.getColumnIndex("phase3Id")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'phase3Id' in existing Realm file. Add @PrimaryKey.");
            }
            if (!table.hasSearchIndex(table.getColumnIndex("phase3Id"))) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'phase3Id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
            }
            if (!columnTypes.containsKey("phase3Supervisor")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Supervisor' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Supervisor") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Supervisor' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3SupervisorIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Supervisor' is required. Either set @Required to field 'phase3Supervisor' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3District")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3District' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3District") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3District' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3DistrictIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3District' is required. Either set @Required to field 'phase3District' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Date")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Date") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Date' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3DateIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Date' is required. Either set @Required to field 'phase3Date' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Mother")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Mother' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Mother") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Mother' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3MotherIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Mother' is required. Either set @Required to field 'phase3Mother' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3MotherAge")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3MotherAge' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3MotherAge") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3MotherAge' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3MotherAgeIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3MotherAge' is required. Either set @Required to field 'phase3MotherAge' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3MotherContact")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3MotherContact' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3MotherContact") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3MotherContact' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3MotherContactIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3MotherContact' is required. Either set @Required to field 'phase3MotherContact' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3MotherAddress")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3MotherAddress' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3MotherAddress") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3MotherAddress' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3MotherAddressIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3MotherAddress' is required. Either set @Required to field 'phase3MotherAddress' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer1Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer1Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer1Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer1Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer1DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer1Db' is required. Either set @Required to field 'phase3Answer1Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer2Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer2Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer2Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer2Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer2DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer2Db' is required. Either set @Required to field 'phase3Answer2Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer3Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer3Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer3Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer3Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer3DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer3Db' is required. Either set @Required to field 'phase3Answer3Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer4Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer4Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer4Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer4Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer4DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer4Db' is required. Either set @Required to field 'phase3Answer4Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer5Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer5Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer5Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer5Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer5DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer5Db' is required. Either set @Required to field 'phase3Answer5Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer6Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer6Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer6Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer6Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer6DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer6Db' is required. Either set @Required to field 'phase3Answer6Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer7Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer7Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer7Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer7Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer7DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer7Db' is required. Either set @Required to field 'phase3Answer7Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer8Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer8Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer8Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer8Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer8DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer8Db' is required. Either set @Required to field 'phase3Answer8Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer9Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer9Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer9Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer9Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer9DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer9Db' is required. Either set @Required to field 'phase3Answer9Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer10Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer10Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer10Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer10Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer10DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer10Db' is required. Either set @Required to field 'phase3Answer10Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer11Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer11Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer11Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer11Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer11DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer11Db' is required. Either set @Required to field 'phase3Answer11Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer12Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer12Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer12Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer12Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer12DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer12Db' is required. Either set @Required to field 'phase3Answer12Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer13Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer13Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer13Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer13Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer13DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer13Db' is required. Either set @Required to field 'phase3Answer13Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer14Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer14Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer14Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer14Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer14DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer14Db' is required. Either set @Required to field 'phase3Answer14Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer15Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer15Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer15Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer15Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer15DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer15Db' is required. Either set @Required to field 'phase3Answer15Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer16Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer16Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer16Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer16Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer16DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer16Db' is required. Either set @Required to field 'phase3Answer16Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer17Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer17Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer17Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer17Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer17DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer17Db' is required. Either set @Required to field 'phase3Answer17Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer18Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer18Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer18Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer18Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer18DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer18Db' is required. Either set @Required to field 'phase3Answer18Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer19Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer19Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer19Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer19Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer19DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer19Db' is required. Either set @Required to field 'phase3Answer19Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer20Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer20Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer20Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer20Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer20DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer20Db' is required. Either set @Required to field 'phase3Answer20Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer21Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer21Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer21Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer21Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer21DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer21Db' is required. Either set @Required to field 'phase3Answer21Db' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("phase3Answer22Db")) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phase3Answer22Db' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("phase3Answer22Db") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phase3Answer22Db' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.phase3Answer22DbIndex)) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phase3Answer22Db' is required. Either set @Required to field 'phase3Answer22Db' or migrate using RealmObjectSchema.setNullable().");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'ActivityPhase3Db' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_ActivityPhase3Db";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db obj = null;
        if (update) {
            Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("phase3Id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("phase3Id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ActivityPhase3DbRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("phase3Id")) {
                if (json.isNull("phase3Id")) {
                    obj = (io.realm.ActivityPhase3DbRealmProxy) realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ActivityPhase3DbRealmProxy) realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class, json.getInt("phase3Id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'phase3Id'.");
            }
        }
        if (json.has("phase3Supervisor")) {
            if (json.isNull("phase3Supervisor")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Supervisor(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Supervisor((String) json.getString("phase3Supervisor"));
            }
        }
        if (json.has("phase3District")) {
            if (json.isNull("phase3District")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3District(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3District((String) json.getString("phase3District"));
            }
        }
        if (json.has("phase3Date")) {
            if (json.isNull("phase3Date")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Date(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Date((String) json.getString("phase3Date"));
            }
        }
        if (json.has("phase3Mother")) {
            if (json.isNull("phase3Mother")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Mother(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Mother((String) json.getString("phase3Mother"));
            }
        }
        if (json.has("phase3MotherAge")) {
            if (json.isNull("phase3MotherAge")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherAge(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherAge((String) json.getString("phase3MotherAge"));
            }
        }
        if (json.has("phase3MotherContact")) {
            if (json.isNull("phase3MotherContact")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherContact(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherContact((String) json.getString("phase3MotherContact"));
            }
        }
        if (json.has("phase3MotherAddress")) {
            if (json.isNull("phase3MotherAddress")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherAddress(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherAddress((String) json.getString("phase3MotherAddress"));
            }
        }
        if (json.has("phase3Answer1Db")) {
            if (json.isNull("phase3Answer1Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer1Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer1Db((String) json.getString("phase3Answer1Db"));
            }
        }
        if (json.has("phase3Answer2Db")) {
            if (json.isNull("phase3Answer2Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer2Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer2Db((String) json.getString("phase3Answer2Db"));
            }
        }
        if (json.has("phase3Answer3Db")) {
            if (json.isNull("phase3Answer3Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer3Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer3Db((String) json.getString("phase3Answer3Db"));
            }
        }
        if (json.has("phase3Answer4Db")) {
            if (json.isNull("phase3Answer4Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer4Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer4Db((String) json.getString("phase3Answer4Db"));
            }
        }
        if (json.has("phase3Answer5Db")) {
            if (json.isNull("phase3Answer5Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer5Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer5Db((String) json.getString("phase3Answer5Db"));
            }
        }
        if (json.has("phase3Answer6Db")) {
            if (json.isNull("phase3Answer6Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer6Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer6Db((String) json.getString("phase3Answer6Db"));
            }
        }
        if (json.has("phase3Answer7Db")) {
            if (json.isNull("phase3Answer7Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer7Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer7Db((String) json.getString("phase3Answer7Db"));
            }
        }
        if (json.has("phase3Answer8Db")) {
            if (json.isNull("phase3Answer8Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer8Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer8Db((String) json.getString("phase3Answer8Db"));
            }
        }
        if (json.has("phase3Answer9Db")) {
            if (json.isNull("phase3Answer9Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer9Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer9Db((String) json.getString("phase3Answer9Db"));
            }
        }
        if (json.has("phase3Answer10Db")) {
            if (json.isNull("phase3Answer10Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer10Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer10Db((String) json.getString("phase3Answer10Db"));
            }
        }
        if (json.has("phase3Answer11Db")) {
            if (json.isNull("phase3Answer11Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer11Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer11Db((String) json.getString("phase3Answer11Db"));
            }
        }
        if (json.has("phase3Answer12Db")) {
            if (json.isNull("phase3Answer12Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer12Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer12Db((String) json.getString("phase3Answer12Db"));
            }
        }
        if (json.has("phase3Answer13Db")) {
            if (json.isNull("phase3Answer13Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer13Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer13Db((String) json.getString("phase3Answer13Db"));
            }
        }
        if (json.has("phase3Answer14Db")) {
            if (json.isNull("phase3Answer14Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer14Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer14Db((String) json.getString("phase3Answer14Db"));
            }
        }
        if (json.has("phase3Answer15Db")) {
            if (json.isNull("phase3Answer15Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer15Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer15Db((String) json.getString("phase3Answer15Db"));
            }
        }
        if (json.has("phase3Answer16Db")) {
            if (json.isNull("phase3Answer16Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer16Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer16Db((String) json.getString("phase3Answer16Db"));
            }
        }
        if (json.has("phase3Answer17Db")) {
            if (json.isNull("phase3Answer17Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer17Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer17Db((String) json.getString("phase3Answer17Db"));
            }
        }
        if (json.has("phase3Answer18Db")) {
            if (json.isNull("phase3Answer18Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer18Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer18Db((String) json.getString("phase3Answer18Db"));
            }
        }
        if (json.has("phase3Answer19Db")) {
            if (json.isNull("phase3Answer19Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer19Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer19Db((String) json.getString("phase3Answer19Db"));
            }
        }
        if (json.has("phase3Answer20Db")) {
            if (json.isNull("phase3Answer20Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer20Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer20Db((String) json.getString("phase3Answer20Db"));
            }
        }
        if (json.has("phase3Answer21Db")) {
            if (json.isNull("phase3Answer21Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer21Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer21Db((String) json.getString("phase3Answer21Db"));
            }
        }
        if (json.has("phase3Answer22Db")) {
            if (json.isNull("phase3Answer22Db")) {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer22Db(null);
            } else {
                ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer22Db((String) json.getString("phase3Answer22Db"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db obj = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("phase3Id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'phase3Id' to null.");
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("phase3Supervisor")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Supervisor(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Supervisor((String) reader.nextString());
                }
            } else if (name.equals("phase3District")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3District(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3District((String) reader.nextString());
                }
            } else if (name.equals("phase3Date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Date(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Date((String) reader.nextString());
                }
            } else if (name.equals("phase3Mother")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Mother(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Mother((String) reader.nextString());
                }
            } else if (name.equals("phase3MotherAge")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherAge(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherAge((String) reader.nextString());
                }
            } else if (name.equals("phase3MotherContact")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherContact(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherContact((String) reader.nextString());
                }
            } else if (name.equals("phase3MotherAddress")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherAddress(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3MotherAddress((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer1Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer1Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer1Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer2Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer2Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer2Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer3Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer3Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer3Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer4Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer4Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer4Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer5Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer5Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer5Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer6Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer6Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer6Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer7Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer7Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer7Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer8Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer8Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer8Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer9Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer9Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer9Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer10Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer10Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer10Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer11Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer11Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer11Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer12Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer12Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer12Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer13Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer13Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer13Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer14Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer14Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer14Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer15Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer15Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer15Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer16Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer16Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer16Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer17Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer17Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer17Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer18Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer18Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer18Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer19Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer19Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer19Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer20Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer20Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer20Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer21Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer21Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer21Db((String) reader.nextString());
                }
            } else if (name.equals("phase3Answer22Db")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer22Db(null);
                } else {
                    ((ActivityPhase3DbRealmProxyInterface) obj).realmSet$phase3Answer22Db((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'phase3Id'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db copyOrUpdate(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) cachedRealmObject;
        } else {
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.ActivityPhase3DbRealmProxy();
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

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db copy(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db realmObject = realm.createObjectInternal(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class, ((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Supervisor(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Supervisor());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3District(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3District());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Date(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Date());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Mother(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Mother());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3MotherAge(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3MotherAge());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3MotherContact(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3MotherContact());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3MotherAddress(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3MotherAddress());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer1Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer1Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer2Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer2Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer3Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer3Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer4Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer4Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer5Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer5Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer6Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer6Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer7Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer7Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer8Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer8Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer9Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer9Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer10Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer10Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer11Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer11Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer12Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer12Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer13Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer13Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer14Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer14Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer15Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer15Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer16Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer16Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer17Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer17Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer18Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer18Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer19Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer19Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer20Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer20Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer21Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer21Db());
            ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer22Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer22Db());
            return realmObject;
        }
    }

    public static long insert(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase3DbColumnInfo columnInfo = (ActivityPhase3DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id(), false);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$phase3Supervisor = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Supervisor();
        if (realmGet$phase3Supervisor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3SupervisorIndex, rowIndex, realmGet$phase3Supervisor, false);
        }
        String realmGet$phase3District = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3District();
        if (realmGet$phase3District != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3DistrictIndex, rowIndex, realmGet$phase3District, false);
        }
        String realmGet$phase3Date = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Date();
        if (realmGet$phase3Date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3DateIndex, rowIndex, realmGet$phase3Date, false);
        }
        String realmGet$phase3Mother = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Mother();
        if (realmGet$phase3Mother != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherIndex, rowIndex, realmGet$phase3Mother, false);
        }
        String realmGet$phase3MotherAge = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherAge();
        if (realmGet$phase3MotherAge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherAgeIndex, rowIndex, realmGet$phase3MotherAge, false);
        }
        String realmGet$phase3MotherContact = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherContact();
        if (realmGet$phase3MotherContact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherContactIndex, rowIndex, realmGet$phase3MotherContact, false);
        }
        String realmGet$phase3MotherAddress = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherAddress();
        if (realmGet$phase3MotherAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherAddressIndex, rowIndex, realmGet$phase3MotherAddress, false);
        }
        String realmGet$phase3Answer1Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer1Db();
        if (realmGet$phase3Answer1Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer1DbIndex, rowIndex, realmGet$phase3Answer1Db, false);
        }
        String realmGet$phase3Answer2Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer2Db();
        if (realmGet$phase3Answer2Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer2DbIndex, rowIndex, realmGet$phase3Answer2Db, false);
        }
        String realmGet$phase3Answer3Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer3Db();
        if (realmGet$phase3Answer3Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer3DbIndex, rowIndex, realmGet$phase3Answer3Db, false);
        }
        String realmGet$phase3Answer4Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer4Db();
        if (realmGet$phase3Answer4Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer4DbIndex, rowIndex, realmGet$phase3Answer4Db, false);
        }
        String realmGet$phase3Answer5Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer5Db();
        if (realmGet$phase3Answer5Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer5DbIndex, rowIndex, realmGet$phase3Answer5Db, false);
        }
        String realmGet$phase3Answer6Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer6Db();
        if (realmGet$phase3Answer6Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer6DbIndex, rowIndex, realmGet$phase3Answer6Db, false);
        }
        String realmGet$phase3Answer7Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer7Db();
        if (realmGet$phase3Answer7Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer7DbIndex, rowIndex, realmGet$phase3Answer7Db, false);
        }
        String realmGet$phase3Answer8Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer8Db();
        if (realmGet$phase3Answer8Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer8DbIndex, rowIndex, realmGet$phase3Answer8Db, false);
        }
        String realmGet$phase3Answer9Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer9Db();
        if (realmGet$phase3Answer9Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer9DbIndex, rowIndex, realmGet$phase3Answer9Db, false);
        }
        String realmGet$phase3Answer10Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer10Db();
        if (realmGet$phase3Answer10Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer10DbIndex, rowIndex, realmGet$phase3Answer10Db, false);
        }
        String realmGet$phase3Answer11Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer11Db();
        if (realmGet$phase3Answer11Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer11DbIndex, rowIndex, realmGet$phase3Answer11Db, false);
        }
        String realmGet$phase3Answer12Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer12Db();
        if (realmGet$phase3Answer12Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer12DbIndex, rowIndex, realmGet$phase3Answer12Db, false);
        }
        String realmGet$phase3Answer13Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer13Db();
        if (realmGet$phase3Answer13Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer13DbIndex, rowIndex, realmGet$phase3Answer13Db, false);
        }
        String realmGet$phase3Answer14Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer14Db();
        if (realmGet$phase3Answer14Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer14DbIndex, rowIndex, realmGet$phase3Answer14Db, false);
        }
        String realmGet$phase3Answer15Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer15Db();
        if (realmGet$phase3Answer15Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer15DbIndex, rowIndex, realmGet$phase3Answer15Db, false);
        }
        String realmGet$phase3Answer16Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer16Db();
        if (realmGet$phase3Answer16Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer16DbIndex, rowIndex, realmGet$phase3Answer16Db, false);
        }
        String realmGet$phase3Answer17Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer17Db();
        if (realmGet$phase3Answer17Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer17DbIndex, rowIndex, realmGet$phase3Answer17Db, false);
        }
        String realmGet$phase3Answer18Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer18Db();
        if (realmGet$phase3Answer18Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer18DbIndex, rowIndex, realmGet$phase3Answer18Db, false);
        }
        String realmGet$phase3Answer19Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer19Db();
        if (realmGet$phase3Answer19Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer19DbIndex, rowIndex, realmGet$phase3Answer19Db, false);
        }
        String realmGet$phase3Answer20Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer20Db();
        if (realmGet$phase3Answer20Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer20DbIndex, rowIndex, realmGet$phase3Answer20Db, false);
        }
        String realmGet$phase3Answer21Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer21Db();
        if (realmGet$phase3Answer21Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer21DbIndex, rowIndex, realmGet$phase3Answer21Db, false);
        }
        String realmGet$phase3Answer22Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer22Db();
        if (realmGet$phase3Answer22Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer22DbIndex, rowIndex, realmGet$phase3Answer22Db, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase3DbColumnInfo columnInfo = (ActivityPhase3DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id(), false);
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$phase3Supervisor = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Supervisor();
                if (realmGet$phase3Supervisor != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3SupervisorIndex, rowIndex, realmGet$phase3Supervisor, false);
                }
                String realmGet$phase3District = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3District();
                if (realmGet$phase3District != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3DistrictIndex, rowIndex, realmGet$phase3District, false);
                }
                String realmGet$phase3Date = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Date();
                if (realmGet$phase3Date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3DateIndex, rowIndex, realmGet$phase3Date, false);
                }
                String realmGet$phase3Mother = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Mother();
                if (realmGet$phase3Mother != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherIndex, rowIndex, realmGet$phase3Mother, false);
                }
                String realmGet$phase3MotherAge = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherAge();
                if (realmGet$phase3MotherAge != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherAgeIndex, rowIndex, realmGet$phase3MotherAge, false);
                }
                String realmGet$phase3MotherContact = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherContact();
                if (realmGet$phase3MotherContact != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherContactIndex, rowIndex, realmGet$phase3MotherContact, false);
                }
                String realmGet$phase3MotherAddress = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherAddress();
                if (realmGet$phase3MotherAddress != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherAddressIndex, rowIndex, realmGet$phase3MotherAddress, false);
                }
                String realmGet$phase3Answer1Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer1Db();
                if (realmGet$phase3Answer1Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer1DbIndex, rowIndex, realmGet$phase3Answer1Db, false);
                }
                String realmGet$phase3Answer2Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer2Db();
                if (realmGet$phase3Answer2Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer2DbIndex, rowIndex, realmGet$phase3Answer2Db, false);
                }
                String realmGet$phase3Answer3Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer3Db();
                if (realmGet$phase3Answer3Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer3DbIndex, rowIndex, realmGet$phase3Answer3Db, false);
                }
                String realmGet$phase3Answer4Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer4Db();
                if (realmGet$phase3Answer4Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer4DbIndex, rowIndex, realmGet$phase3Answer4Db, false);
                }
                String realmGet$phase3Answer5Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer5Db();
                if (realmGet$phase3Answer5Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer5DbIndex, rowIndex, realmGet$phase3Answer5Db, false);
                }
                String realmGet$phase3Answer6Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer6Db();
                if (realmGet$phase3Answer6Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer6DbIndex, rowIndex, realmGet$phase3Answer6Db, false);
                }
                String realmGet$phase3Answer7Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer7Db();
                if (realmGet$phase3Answer7Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer7DbIndex, rowIndex, realmGet$phase3Answer7Db, false);
                }
                String realmGet$phase3Answer8Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer8Db();
                if (realmGet$phase3Answer8Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer8DbIndex, rowIndex, realmGet$phase3Answer8Db, false);
                }
                String realmGet$phase3Answer9Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer9Db();
                if (realmGet$phase3Answer9Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer9DbIndex, rowIndex, realmGet$phase3Answer9Db, false);
                }
                String realmGet$phase3Answer10Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer10Db();
                if (realmGet$phase3Answer10Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer10DbIndex, rowIndex, realmGet$phase3Answer10Db, false);
                }
                String realmGet$phase3Answer11Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer11Db();
                if (realmGet$phase3Answer11Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer11DbIndex, rowIndex, realmGet$phase3Answer11Db, false);
                }
                String realmGet$phase3Answer12Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer12Db();
                if (realmGet$phase3Answer12Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer12DbIndex, rowIndex, realmGet$phase3Answer12Db, false);
                }
                String realmGet$phase3Answer13Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer13Db();
                if (realmGet$phase3Answer13Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer13DbIndex, rowIndex, realmGet$phase3Answer13Db, false);
                }
                String realmGet$phase3Answer14Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer14Db();
                if (realmGet$phase3Answer14Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer14DbIndex, rowIndex, realmGet$phase3Answer14Db, false);
                }
                String realmGet$phase3Answer15Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer15Db();
                if (realmGet$phase3Answer15Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer15DbIndex, rowIndex, realmGet$phase3Answer15Db, false);
                }
                String realmGet$phase3Answer16Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer16Db();
                if (realmGet$phase3Answer16Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer16DbIndex, rowIndex, realmGet$phase3Answer16Db, false);
                }
                String realmGet$phase3Answer17Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer17Db();
                if (realmGet$phase3Answer17Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer17DbIndex, rowIndex, realmGet$phase3Answer17Db, false);
                }
                String realmGet$phase3Answer18Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer18Db();
                if (realmGet$phase3Answer18Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer18DbIndex, rowIndex, realmGet$phase3Answer18Db, false);
                }
                String realmGet$phase3Answer19Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer19Db();
                if (realmGet$phase3Answer19Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer19DbIndex, rowIndex, realmGet$phase3Answer19Db, false);
                }
                String realmGet$phase3Answer20Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer20Db();
                if (realmGet$phase3Answer20Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer20DbIndex, rowIndex, realmGet$phase3Answer20Db, false);
                }
                String realmGet$phase3Answer21Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer21Db();
                if (realmGet$phase3Answer21Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer21DbIndex, rowIndex, realmGet$phase3Answer21Db, false);
                }
                String realmGet$phase3Answer22Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer22Db();
                if (realmGet$phase3Answer22Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer22DbIndex, rowIndex, realmGet$phase3Answer22Db, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase3DbColumnInfo columnInfo = (ActivityPhase3DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id(), false);
        }
        cache.put(object, rowIndex);
        String realmGet$phase3Supervisor = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Supervisor();
        if (realmGet$phase3Supervisor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3SupervisorIndex, rowIndex, realmGet$phase3Supervisor, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3SupervisorIndex, rowIndex, false);
        }
        String realmGet$phase3District = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3District();
        if (realmGet$phase3District != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3DistrictIndex, rowIndex, realmGet$phase3District, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3DistrictIndex, rowIndex, false);
        }
        String realmGet$phase3Date = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Date();
        if (realmGet$phase3Date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3DateIndex, rowIndex, realmGet$phase3Date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3DateIndex, rowIndex, false);
        }
        String realmGet$phase3Mother = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Mother();
        if (realmGet$phase3Mother != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherIndex, rowIndex, realmGet$phase3Mother, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3MotherIndex, rowIndex, false);
        }
        String realmGet$phase3MotherAge = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherAge();
        if (realmGet$phase3MotherAge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherAgeIndex, rowIndex, realmGet$phase3MotherAge, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3MotherAgeIndex, rowIndex, false);
        }
        String realmGet$phase3MotherContact = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherContact();
        if (realmGet$phase3MotherContact != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherContactIndex, rowIndex, realmGet$phase3MotherContact, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3MotherContactIndex, rowIndex, false);
        }
        String realmGet$phase3MotherAddress = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherAddress();
        if (realmGet$phase3MotherAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherAddressIndex, rowIndex, realmGet$phase3MotherAddress, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3MotherAddressIndex, rowIndex, false);
        }
        String realmGet$phase3Answer1Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer1Db();
        if (realmGet$phase3Answer1Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer1DbIndex, rowIndex, realmGet$phase3Answer1Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer1DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer2Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer2Db();
        if (realmGet$phase3Answer2Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer2DbIndex, rowIndex, realmGet$phase3Answer2Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer2DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer3Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer3Db();
        if (realmGet$phase3Answer3Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer3DbIndex, rowIndex, realmGet$phase3Answer3Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer3DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer4Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer4Db();
        if (realmGet$phase3Answer4Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer4DbIndex, rowIndex, realmGet$phase3Answer4Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer4DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer5Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer5Db();
        if (realmGet$phase3Answer5Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer5DbIndex, rowIndex, realmGet$phase3Answer5Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer5DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer6Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer6Db();
        if (realmGet$phase3Answer6Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer6DbIndex, rowIndex, realmGet$phase3Answer6Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer6DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer7Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer7Db();
        if (realmGet$phase3Answer7Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer7DbIndex, rowIndex, realmGet$phase3Answer7Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer7DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer8Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer8Db();
        if (realmGet$phase3Answer8Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer8DbIndex, rowIndex, realmGet$phase3Answer8Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer8DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer9Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer9Db();
        if (realmGet$phase3Answer9Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer9DbIndex, rowIndex, realmGet$phase3Answer9Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer9DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer10Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer10Db();
        if (realmGet$phase3Answer10Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer10DbIndex, rowIndex, realmGet$phase3Answer10Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer10DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer11Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer11Db();
        if (realmGet$phase3Answer11Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer11DbIndex, rowIndex, realmGet$phase3Answer11Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer11DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer12Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer12Db();
        if (realmGet$phase3Answer12Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer12DbIndex, rowIndex, realmGet$phase3Answer12Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer12DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer13Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer13Db();
        if (realmGet$phase3Answer13Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer13DbIndex, rowIndex, realmGet$phase3Answer13Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer13DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer14Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer14Db();
        if (realmGet$phase3Answer14Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer14DbIndex, rowIndex, realmGet$phase3Answer14Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer14DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer15Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer15Db();
        if (realmGet$phase3Answer15Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer15DbIndex, rowIndex, realmGet$phase3Answer15Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer15DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer16Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer16Db();
        if (realmGet$phase3Answer16Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer16DbIndex, rowIndex, realmGet$phase3Answer16Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer16DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer17Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer17Db();
        if (realmGet$phase3Answer17Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer17DbIndex, rowIndex, realmGet$phase3Answer17Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer17DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer18Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer18Db();
        if (realmGet$phase3Answer18Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer18DbIndex, rowIndex, realmGet$phase3Answer18Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer18DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer19Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer19Db();
        if (realmGet$phase3Answer19Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer19DbIndex, rowIndex, realmGet$phase3Answer19Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer19DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer20Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer20Db();
        if (realmGet$phase3Answer20Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer20DbIndex, rowIndex, realmGet$phase3Answer20Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer20DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer21Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer21Db();
        if (realmGet$phase3Answer21Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer21DbIndex, rowIndex, realmGet$phase3Answer21Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer21DbIndex, rowIndex, false);
        }
        String realmGet$phase3Answer22Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer22Db();
        if (realmGet$phase3Answer22Db != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer22DbIndex, rowIndex, realmGet$phase3Answer22Db, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer22DbIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        long tableNativePtr = table.getNativeTablePointer();
        ActivityPhase3DbColumnInfo columnInfo = (ActivityPhase3DbColumnInfo) realm.schema.getColumnInfo(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db.class);
        long pkColumnIndex = table.getPrimaryKey();
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db object = null;
        while (objects.hasNext()) {
            object = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(((ActivityPhase3DbRealmProxyInterface) object).realmGet$phase3Id(), false);
                }
                cache.put(object, rowIndex);
                String realmGet$phase3Supervisor = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Supervisor();
                if (realmGet$phase3Supervisor != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3SupervisorIndex, rowIndex, realmGet$phase3Supervisor, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3SupervisorIndex, rowIndex, false);
                }
                String realmGet$phase3District = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3District();
                if (realmGet$phase3District != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3DistrictIndex, rowIndex, realmGet$phase3District, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3DistrictIndex, rowIndex, false);
                }
                String realmGet$phase3Date = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Date();
                if (realmGet$phase3Date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3DateIndex, rowIndex, realmGet$phase3Date, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3DateIndex, rowIndex, false);
                }
                String realmGet$phase3Mother = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Mother();
                if (realmGet$phase3Mother != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherIndex, rowIndex, realmGet$phase3Mother, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3MotherIndex, rowIndex, false);
                }
                String realmGet$phase3MotherAge = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherAge();
                if (realmGet$phase3MotherAge != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherAgeIndex, rowIndex, realmGet$phase3MotherAge, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3MotherAgeIndex, rowIndex, false);
                }
                String realmGet$phase3MotherContact = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherContact();
                if (realmGet$phase3MotherContact != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherContactIndex, rowIndex, realmGet$phase3MotherContact, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3MotherContactIndex, rowIndex, false);
                }
                String realmGet$phase3MotherAddress = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3MotherAddress();
                if (realmGet$phase3MotherAddress != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3MotherAddressIndex, rowIndex, realmGet$phase3MotherAddress, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3MotherAddressIndex, rowIndex, false);
                }
                String realmGet$phase3Answer1Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer1Db();
                if (realmGet$phase3Answer1Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer1DbIndex, rowIndex, realmGet$phase3Answer1Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer1DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer2Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer2Db();
                if (realmGet$phase3Answer2Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer2DbIndex, rowIndex, realmGet$phase3Answer2Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer2DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer3Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer3Db();
                if (realmGet$phase3Answer3Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer3DbIndex, rowIndex, realmGet$phase3Answer3Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer3DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer4Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer4Db();
                if (realmGet$phase3Answer4Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer4DbIndex, rowIndex, realmGet$phase3Answer4Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer4DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer5Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer5Db();
                if (realmGet$phase3Answer5Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer5DbIndex, rowIndex, realmGet$phase3Answer5Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer5DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer6Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer6Db();
                if (realmGet$phase3Answer6Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer6DbIndex, rowIndex, realmGet$phase3Answer6Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer6DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer7Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer7Db();
                if (realmGet$phase3Answer7Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer7DbIndex, rowIndex, realmGet$phase3Answer7Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer7DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer8Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer8Db();
                if (realmGet$phase3Answer8Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer8DbIndex, rowIndex, realmGet$phase3Answer8Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer8DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer9Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer9Db();
                if (realmGet$phase3Answer9Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer9DbIndex, rowIndex, realmGet$phase3Answer9Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer9DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer10Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer10Db();
                if (realmGet$phase3Answer10Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer10DbIndex, rowIndex, realmGet$phase3Answer10Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer10DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer11Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer11Db();
                if (realmGet$phase3Answer11Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer11DbIndex, rowIndex, realmGet$phase3Answer11Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer11DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer12Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer12Db();
                if (realmGet$phase3Answer12Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer12DbIndex, rowIndex, realmGet$phase3Answer12Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer12DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer13Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer13Db();
                if (realmGet$phase3Answer13Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer13DbIndex, rowIndex, realmGet$phase3Answer13Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer13DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer14Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer14Db();
                if (realmGet$phase3Answer14Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer14DbIndex, rowIndex, realmGet$phase3Answer14Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer14DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer15Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer15Db();
                if (realmGet$phase3Answer15Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer15DbIndex, rowIndex, realmGet$phase3Answer15Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer15DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer16Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer16Db();
                if (realmGet$phase3Answer16Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer16DbIndex, rowIndex, realmGet$phase3Answer16Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer16DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer17Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer17Db();
                if (realmGet$phase3Answer17Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer17DbIndex, rowIndex, realmGet$phase3Answer17Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer17DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer18Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer18Db();
                if (realmGet$phase3Answer18Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer18DbIndex, rowIndex, realmGet$phase3Answer18Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer18DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer19Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer19Db();
                if (realmGet$phase3Answer19Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer19DbIndex, rowIndex, realmGet$phase3Answer19Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer19DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer20Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer20Db();
                if (realmGet$phase3Answer20Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer20DbIndex, rowIndex, realmGet$phase3Answer20Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer20DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer21Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer21Db();
                if (realmGet$phase3Answer21Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer21DbIndex, rowIndex, realmGet$phase3Answer21Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer21DbIndex, rowIndex, false);
                }
                String realmGet$phase3Answer22Db = ((ActivityPhase3DbRealmProxyInterface)object).realmGet$phase3Answer22Db();
                if (realmGet$phase3Answer22Db != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phase3Answer22DbIndex, rowIndex, realmGet$phase3Answer22Db, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phase3Answer22DbIndex, rowIndex, false);
                }
            }
        }
    }

    public static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db createDetachedCopy(mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db)cachedObject.object;
            } else {
                unmanagedObject = (mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Id(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Id());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Supervisor(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Supervisor());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3District(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3District());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Date(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Date());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Mother(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Mother());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3MotherAge(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3MotherAge());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3MotherContact(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3MotherContact());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3MotherAddress(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3MotherAddress());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer1Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer1Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer2Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer2Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer3Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer3Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer4Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer4Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer5Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer5Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer6Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer6Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer7Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer7Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer8Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer8Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer9Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer9Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer10Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer10Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer11Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer11Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer12Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer12Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer13Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer13Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer14Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer14Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer15Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer15Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer16Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer16Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer17Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer17Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer18Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer18Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer19Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer19Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer20Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer20Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer21Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer21Db());
        ((ActivityPhase3DbRealmProxyInterface) unmanagedObject).realmSet$phase3Answer22Db(((ActivityPhase3DbRealmProxyInterface) realmObject).realmGet$phase3Answer22Db());
        return unmanagedObject;
    }

    static mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db update(Realm realm, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db realmObject, mic.unlimited.com.reportingapp.Database.Activity.ActivityPhase3Db newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Supervisor(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Supervisor());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3District(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3District());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Date(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Date());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Mother(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Mother());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3MotherAge(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3MotherAge());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3MotherContact(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3MotherContact());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3MotherAddress(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3MotherAddress());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer1Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer1Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer2Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer2Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer3Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer3Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer4Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer4Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer5Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer5Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer6Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer6Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer7Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer7Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer8Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer8Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer9Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer9Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer10Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer10Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer11Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer11Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer12Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer12Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer13Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer13Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer14Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer14Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer15Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer15Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer16Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer16Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer17Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer17Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer18Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer18Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer19Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer19Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer20Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer20Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer21Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer21Db());
        ((ActivityPhase3DbRealmProxyInterface) realmObject).realmSet$phase3Answer22Db(((ActivityPhase3DbRealmProxyInterface) newObject).realmGet$phase3Answer22Db());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ActivityPhase3Db = [");
        stringBuilder.append("{phase3Id:");
        stringBuilder.append(realmGet$phase3Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Supervisor:");
        stringBuilder.append(realmGet$phase3Supervisor() != null ? realmGet$phase3Supervisor() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3District:");
        stringBuilder.append(realmGet$phase3District() != null ? realmGet$phase3District() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Date:");
        stringBuilder.append(realmGet$phase3Date() != null ? realmGet$phase3Date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Mother:");
        stringBuilder.append(realmGet$phase3Mother() != null ? realmGet$phase3Mother() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3MotherAge:");
        stringBuilder.append(realmGet$phase3MotherAge() != null ? realmGet$phase3MotherAge() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3MotherContact:");
        stringBuilder.append(realmGet$phase3MotherContact() != null ? realmGet$phase3MotherContact() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3MotherAddress:");
        stringBuilder.append(realmGet$phase3MotherAddress() != null ? realmGet$phase3MotherAddress() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer1Db:");
        stringBuilder.append(realmGet$phase3Answer1Db() != null ? realmGet$phase3Answer1Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer2Db:");
        stringBuilder.append(realmGet$phase3Answer2Db() != null ? realmGet$phase3Answer2Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer3Db:");
        stringBuilder.append(realmGet$phase3Answer3Db() != null ? realmGet$phase3Answer3Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer4Db:");
        stringBuilder.append(realmGet$phase3Answer4Db() != null ? realmGet$phase3Answer4Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer5Db:");
        stringBuilder.append(realmGet$phase3Answer5Db() != null ? realmGet$phase3Answer5Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer6Db:");
        stringBuilder.append(realmGet$phase3Answer6Db() != null ? realmGet$phase3Answer6Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer7Db:");
        stringBuilder.append(realmGet$phase3Answer7Db() != null ? realmGet$phase3Answer7Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer8Db:");
        stringBuilder.append(realmGet$phase3Answer8Db() != null ? realmGet$phase3Answer8Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer9Db:");
        stringBuilder.append(realmGet$phase3Answer9Db() != null ? realmGet$phase3Answer9Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer10Db:");
        stringBuilder.append(realmGet$phase3Answer10Db() != null ? realmGet$phase3Answer10Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer11Db:");
        stringBuilder.append(realmGet$phase3Answer11Db() != null ? realmGet$phase3Answer11Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer12Db:");
        stringBuilder.append(realmGet$phase3Answer12Db() != null ? realmGet$phase3Answer12Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer13Db:");
        stringBuilder.append(realmGet$phase3Answer13Db() != null ? realmGet$phase3Answer13Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer14Db:");
        stringBuilder.append(realmGet$phase3Answer14Db() != null ? realmGet$phase3Answer14Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer15Db:");
        stringBuilder.append(realmGet$phase3Answer15Db() != null ? realmGet$phase3Answer15Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer16Db:");
        stringBuilder.append(realmGet$phase3Answer16Db() != null ? realmGet$phase3Answer16Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer17Db:");
        stringBuilder.append(realmGet$phase3Answer17Db() != null ? realmGet$phase3Answer17Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer18Db:");
        stringBuilder.append(realmGet$phase3Answer18Db() != null ? realmGet$phase3Answer18Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer19Db:");
        stringBuilder.append(realmGet$phase3Answer19Db() != null ? realmGet$phase3Answer19Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer20Db:");
        stringBuilder.append(realmGet$phase3Answer20Db() != null ? realmGet$phase3Answer20Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer21Db:");
        stringBuilder.append(realmGet$phase3Answer21Db() != null ? realmGet$phase3Answer21Db() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phase3Answer22Db:");
        stringBuilder.append(realmGet$phase3Answer22Db() != null ? realmGet$phase3Answer22Db() : "null");
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
        ActivityPhase3DbRealmProxy aActivityPhase3Db = (ActivityPhase3DbRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aActivityPhase3Db.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aActivityPhase3Db.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aActivityPhase3Db.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
