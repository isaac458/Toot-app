package com.empire.myapplication.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TootDatabase_Impl extends TootDatabase {
  private volatile TootDao _tootDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `ChatSession` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `createdAt` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `Message` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sessionId` INTEGER NOT NULL, `role` TEXT NOT NULL, `content` TEXT NOT NULL, `imageUri` TEXT, `hasSources` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, FOREIGN KEY(`sessionId`) REFERENCES `ChatSession`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_Message_sessionId` ON `Message` (`sessionId`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `SourceRef` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `messageId` INTEGER NOT NULL, `title` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `url` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `UserProfile` (`uid` TEXT NOT NULL, `name` TEXT NOT NULL, `email` TEXT NOT NULL, `photoUrl` TEXT, `age` INTEGER NOT NULL, `provider` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `UserMemory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a72ee57ac3c95fa274f1e66a05d3971b')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `ChatSession`");
        db.execSQL("DROP TABLE IF EXISTS `Message`");
        db.execSQL("DROP TABLE IF EXISTS `SourceRef`");
        db.execSQL("DROP TABLE IF EXISTS `UserProfile`");
        db.execSQL("DROP TABLE IF EXISTS `UserMemory`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsChatSession = new HashMap<String, TableInfo.Column>(4);
        _columnsChatSession.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatSession.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatSession.put("ownerId", new TableInfo.Column("ownerId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatSession.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChatSession = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChatSession = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChatSession = new TableInfo("ChatSession", _columnsChatSession, _foreignKeysChatSession, _indicesChatSession);
        final TableInfo _existingChatSession = TableInfo.read(db, "ChatSession");
        if (!_infoChatSession.equals(_existingChatSession)) {
          return new RoomOpenHelper.ValidationResult(false, "ChatSession(com.empire.myapplication.data.local.ChatSession).\n"
                  + " Expected:\n" + _infoChatSession + "\n"
                  + " Found:\n" + _existingChatSession);
        }
        final HashMap<String, TableInfo.Column> _columnsMessage = new HashMap<String, TableInfo.Column>(7);
        _columnsMessage.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessage.put("sessionId", new TableInfo.Column("sessionId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessage.put("role", new TableInfo.Column("role", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessage.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessage.put("imageUri", new TableInfo.Column("imageUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessage.put("hasSources", new TableInfo.Column("hasSources", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMessage.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMessage = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysMessage.add(new TableInfo.ForeignKey("ChatSession", "CASCADE", "NO ACTION", Arrays.asList("sessionId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesMessage = new HashSet<TableInfo.Index>(1);
        _indicesMessage.add(new TableInfo.Index("index_Message_sessionId", false, Arrays.asList("sessionId"), Arrays.asList("ASC")));
        final TableInfo _infoMessage = new TableInfo("Message", _columnsMessage, _foreignKeysMessage, _indicesMessage);
        final TableInfo _existingMessage = TableInfo.read(db, "Message");
        if (!_infoMessage.equals(_existingMessage)) {
          return new RoomOpenHelper.ValidationResult(false, "Message(com.empire.myapplication.data.local.Message).\n"
                  + " Expected:\n" + _infoMessage + "\n"
                  + " Found:\n" + _existingMessage);
        }
        final HashMap<String, TableInfo.Column> _columnsSourceRef = new HashMap<String, TableInfo.Column>(5);
        _columnsSourceRef.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceRef.put("messageId", new TableInfo.Column("messageId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceRef.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceRef.put("ownerId", new TableInfo.Column("ownerId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceRef.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSourceRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSourceRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSourceRef = new TableInfo("SourceRef", _columnsSourceRef, _foreignKeysSourceRef, _indicesSourceRef);
        final TableInfo _existingSourceRef = TableInfo.read(db, "SourceRef");
        if (!_infoSourceRef.equals(_existingSourceRef)) {
          return new RoomOpenHelper.ValidationResult(false, "SourceRef(com.empire.myapplication.data.local.SourceRef).\n"
                  + " Expected:\n" + _infoSourceRef + "\n"
                  + " Found:\n" + _existingSourceRef);
        }
        final HashMap<String, TableInfo.Column> _columnsUserProfile = new HashMap<String, TableInfo.Column>(7);
        _columnsUserProfile.put("uid", new TableInfo.Column("uid", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("photoUrl", new TableInfo.Column("photoUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("age", new TableInfo.Column("age", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("provider", new TableInfo.Column("provider", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserProfile = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserProfile = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserProfile = new TableInfo("UserProfile", _columnsUserProfile, _foreignKeysUserProfile, _indicesUserProfile);
        final TableInfo _existingUserProfile = TableInfo.read(db, "UserProfile");
        if (!_infoUserProfile.equals(_existingUserProfile)) {
          return new RoomOpenHelper.ValidationResult(false, "UserProfile(com.empire.myapplication.data.local.UserProfile).\n"
                  + " Expected:\n" + _infoUserProfile + "\n"
                  + " Found:\n" + _existingUserProfile);
        }
        final HashMap<String, TableInfo.Column> _columnsUserMemory = new HashMap<String, TableInfo.Column>(3);
        _columnsUserMemory.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserMemory.put("key", new TableInfo.Column("key", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserMemory.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserMemory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserMemory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserMemory = new TableInfo("UserMemory", _columnsUserMemory, _foreignKeysUserMemory, _indicesUserMemory);
        final TableInfo _existingUserMemory = TableInfo.read(db, "UserMemory");
        if (!_infoUserMemory.equals(_existingUserMemory)) {
          return new RoomOpenHelper.ValidationResult(false, "UserMemory(com.empire.myapplication.data.local.UserMemory).\n"
                  + " Expected:\n" + _infoUserMemory + "\n"
                  + " Found:\n" + _existingUserMemory);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "a72ee57ac3c95fa274f1e66a05d3971b", "2d6462708bc1061a21b882ba5759d990");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ChatSession","Message","SourceRef","UserProfile","UserMemory");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `ChatSession`");
      _db.execSQL("DELETE FROM `Message`");
      _db.execSQL("DELETE FROM `SourceRef`");
      _db.execSQL("DELETE FROM `UserProfile`");
      _db.execSQL("DELETE FROM `UserMemory`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TootDao.class, TootDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public TootDao tootDao() {
    if (_tootDao != null) {
      return _tootDao;
    } else {
      synchronized(this) {
        if(_tootDao == null) {
          _tootDao = new TootDao_Impl(this);
        }
        return _tootDao;
      }
    }
  }
}
