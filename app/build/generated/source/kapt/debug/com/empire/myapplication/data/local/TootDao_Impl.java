package com.empire.myapplication.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TootDao_Impl implements TootDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChatSession> __insertionAdapterOfChatSession;

  private final EntityInsertionAdapter<Message> __insertionAdapterOfMessage;

  private final EntityInsertionAdapter<SourceRef> __insertionAdapterOfSourceRef;

  private final EntityInsertionAdapter<UserMemory> __insertionAdapterOfUserMemory;

  private final EntityInsertionAdapter<UserProfile> __insertionAdapterOfUserProfile;

  private final EntityDeletionOrUpdateAdapter<ChatSession> __deletionAdapterOfChatSession;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSessionTitle;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSessionById;

  private final SharedSQLiteStatement __preparedStmtOfClearSessionsForOwner;

  private final SharedSQLiteStatement __preparedStmtOfClearAllSessions;

  private final SharedSQLiteStatement __preparedStmtOfClearAllMessages;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMessagesForSession;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMessageById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSourcesForMessage;

  private final SharedSQLiteStatement __preparedStmtOfSetMessageHasSources;

  public TootDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChatSession = new EntityInsertionAdapter<ChatSession>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `ChatSession` (`id`,`title`,`ownerId`,`createdAt`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ChatSession entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getOwnerId() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getOwnerId());
        }
        statement.bindLong(4, entity.getCreatedAt());
      }
    };
    this.__insertionAdapterOfMessage = new EntityInsertionAdapter<Message>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `Message` (`id`,`sessionId`,`role`,`content`,`imageUri`,`hasSources`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Message entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getSessionId());
        if (entity.getRole() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getRole());
        }
        if (entity.getContent() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getContent());
        }
        if (entity.getImageUri() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getImageUri());
        }
        final int _tmp = entity.getHasSources() ? 1 : 0;
        statement.bindLong(6, _tmp);
        statement.bindLong(7, entity.getTimestamp());
      }
    };
    this.__insertionAdapterOfSourceRef = new EntityInsertionAdapter<SourceRef>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `SourceRef` (`id`,`messageId`,`title`,`ownerId`,`url`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SourceRef entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getMessageId());
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        if (entity.getOwnerId() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getOwnerId());
        }
        if (entity.getUrl() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getUrl());
        }
      }
    };
    this.__insertionAdapterOfUserMemory = new EntityInsertionAdapter<UserMemory>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `UserMemory` (`id`,`key`,`value`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserMemory entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getKey() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getKey());
        }
        if (entity.getValue() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getValue());
        }
      }
    };
    this.__insertionAdapterOfUserProfile = new EntityInsertionAdapter<UserProfile>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `UserProfile` (`uid`,`name`,`email`,`photoUrl`,`age`,`provider`,`createdAt`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserProfile entity) {
        if (entity.getUid() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getUid());
        }
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEmail());
        }
        if (entity.getPhotoUrl() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPhotoUrl());
        }
        statement.bindLong(5, entity.getAge());
        if (entity.getProvider() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getProvider());
        }
        statement.bindLong(7, entity.getCreatedAt());
      }
    };
    this.__deletionAdapterOfChatSession = new EntityDeletionOrUpdateAdapter<ChatSession>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `ChatSession` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ChatSession entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__preparedStmtOfUpdateSessionTitle = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE ChatSession SET title = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSessionById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ChatSession WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearSessionsForOwner = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ChatSession WHERE ownerId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearAllSessions = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ChatSession";
        return _query;
      }
    };
    this.__preparedStmtOfClearAllMessages = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Message";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteMessagesForSession = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Message WHERE sessionId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteMessageById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Message WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSourcesForMessage = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM SourceRef WHERE messageId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetMessageHasSources = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE Message SET hasSources = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertSession(final ChatSession session,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfChatSession.insertAndReturnId(session);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertMessage(final Message message, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfMessage.insertAndReturnId(message);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertSource(final SourceRef source, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSourceRef.insert(source);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertMemory(final UserMemory memory,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserMemory.insert(memory);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertProfile(final UserProfile profile,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserProfile.insert(profile);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteSession(final ChatSession session,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfChatSession.handle(session);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateSessionTitle(final long sessionId, final String title,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSessionTitle.acquire();
        int _argIndex = 1;
        if (title == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, title);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, sessionId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateSessionTitle.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteSessionById(final long sessionId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSessionById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, sessionId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteSessionById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearSessionsForOwner(final String ownerId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearSessionsForOwner.acquire();
        int _argIndex = 1;
        if (ownerId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, ownerId);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearSessionsForOwner.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearAllSessions(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllSessions.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearAllSessions.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearAllMessages(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllMessages.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearAllMessages.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteMessagesForSession(final long sessionId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMessagesForSession.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, sessionId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteMessagesForSession.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteMessageById(final long messageId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMessageById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, messageId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteMessageById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteSourcesForMessage(final long messageId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSourcesForMessage.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, messageId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteSourcesForMessage.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object setMessageHasSources(final long messageId, final boolean hasSources,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetMessageHasSources.acquire();
        int _argIndex = 1;
        final int _tmp = hasSources ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, messageId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfSetMessageHasSources.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<ChatSession>> getSessionsForOwner(final String ownerId) {
    final String _sql = "SELECT * FROM ChatSession WHERE ownerId = ? ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (ownerId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, ownerId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"ChatSession"}, new Callable<List<ChatSession>>() {
      @Override
      @NonNull
      public List<ChatSession> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfOwnerId = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<ChatSession> _result = new ArrayList<ChatSession>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ChatSession _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpOwnerId;
            if (_cursor.isNull(_cursorIndexOfOwnerId)) {
              _tmpOwnerId = null;
            } else {
              _tmpOwnerId = _cursor.getString(_cursorIndexOfOwnerId);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new ChatSession(_tmpId,_tmpTitle,_tmpOwnerId,_tmpCreatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Message>> getMessagesForSession(final long sessionId) {
    final String _sql = "SELECT * FROM Message WHERE sessionId = ? ORDER BY timestamp ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, sessionId);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Message"}, new Callable<List<Message>>() {
      @Override
      @NonNull
      public List<Message> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfImageUri = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUri");
          final int _cursorIndexOfHasSources = CursorUtil.getColumnIndexOrThrow(_cursor, "hasSources");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<Message> _result = new ArrayList<Message>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Message _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpSessionId;
            _tmpSessionId = _cursor.getLong(_cursorIndexOfSessionId);
            final String _tmpRole;
            if (_cursor.isNull(_cursorIndexOfRole)) {
              _tmpRole = null;
            } else {
              _tmpRole = _cursor.getString(_cursorIndexOfRole);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpImageUri;
            if (_cursor.isNull(_cursorIndexOfImageUri)) {
              _tmpImageUri = null;
            } else {
              _tmpImageUri = _cursor.getString(_cursorIndexOfImageUri);
            }
            final boolean _tmpHasSources;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasSources);
            _tmpHasSources = _tmp != 0;
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            _item = new Message(_tmpId,_tmpSessionId,_tmpRole,_tmpContent,_tmpImageUri,_tmpHasSources,_tmpTimestamp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getMessagesForSessionOnce(final long sessionId,
      final Continuation<? super List<Message>> $completion) {
    final String _sql = "SELECT * FROM Message WHERE sessionId = ? ORDER BY timestamp ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, sessionId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Message>>() {
      @Override
      @NonNull
      public List<Message> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfImageUri = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUri");
          final int _cursorIndexOfHasSources = CursorUtil.getColumnIndexOrThrow(_cursor, "hasSources");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<Message> _result = new ArrayList<Message>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Message _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpSessionId;
            _tmpSessionId = _cursor.getLong(_cursorIndexOfSessionId);
            final String _tmpRole;
            if (_cursor.isNull(_cursorIndexOfRole)) {
              _tmpRole = null;
            } else {
              _tmpRole = _cursor.getString(_cursorIndexOfRole);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpImageUri;
            if (_cursor.isNull(_cursorIndexOfImageUri)) {
              _tmpImageUri = null;
            } else {
              _tmpImageUri = _cursor.getString(_cursorIndexOfImageUri);
            }
            final boolean _tmpHasSources;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasSources);
            _tmpHasSources = _tmp != 0;
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            _item = new Message(_tmpId,_tmpSessionId,_tmpRole,_tmpContent,_tmpImageUri,_tmpHasSources,_tmpTimestamp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<SourceRef>> getSourcesForMessage(final long messageId) {
    final String _sql = "SELECT * FROM SourceRef WHERE messageId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, messageId);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"SourceRef"}, new Callable<List<SourceRef>>() {
      @Override
      @NonNull
      public List<SourceRef> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMessageId = CursorUtil.getColumnIndexOrThrow(_cursor, "messageId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfOwnerId = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerId");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final List<SourceRef> _result = new ArrayList<SourceRef>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final SourceRef _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpMessageId;
            _tmpMessageId = _cursor.getLong(_cursorIndexOfMessageId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpOwnerId;
            if (_cursor.isNull(_cursorIndexOfOwnerId)) {
              _tmpOwnerId = null;
            } else {
              _tmpOwnerId = _cursor.getString(_cursorIndexOfOwnerId);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item = new SourceRef(_tmpId,_tmpMessageId,_tmpTitle,_tmpOwnerId,_tmpUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<UserMemory>> getUserMemory() {
    final String _sql = "SELECT * FROM UserMemory";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"UserMemory"}, new Callable<List<UserMemory>>() {
      @Override
      @NonNull
      public List<UserMemory> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final List<UserMemory> _result = new ArrayList<UserMemory>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserMemory _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpKey;
            if (_cursor.isNull(_cursorIndexOfKey)) {
              _tmpKey = null;
            } else {
              _tmpKey = _cursor.getString(_cursorIndexOfKey);
            }
            final String _tmpValue;
            if (_cursor.isNull(_cursorIndexOfValue)) {
              _tmpValue = null;
            } else {
              _tmpValue = _cursor.getString(_cursorIndexOfValue);
            }
            _item = new UserMemory(_tmpId,_tmpKey,_tmpValue);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<UserProfile> getUserProfile() {
    final String _sql = "SELECT * FROM UserProfile LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"UserProfile"}, new Callable<UserProfile>() {
      @Override
      @Nullable
      public UserProfile call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPhotoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUrl");
          final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
          final int _cursorIndexOfProvider = CursorUtil.getColumnIndexOrThrow(_cursor, "provider");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final UserProfile _result;
          if (_cursor.moveToFirst()) {
            final String _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getString(_cursorIndexOfUid);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpPhotoUrl;
            if (_cursor.isNull(_cursorIndexOfPhotoUrl)) {
              _tmpPhotoUrl = null;
            } else {
              _tmpPhotoUrl = _cursor.getString(_cursorIndexOfPhotoUrl);
            }
            final int _tmpAge;
            _tmpAge = _cursor.getInt(_cursorIndexOfAge);
            final String _tmpProvider;
            if (_cursor.isNull(_cursorIndexOfProvider)) {
              _tmpProvider = null;
            } else {
              _tmpProvider = _cursor.getString(_cursorIndexOfProvider);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _result = new UserProfile(_tmpUid,_tmpName,_tmpEmail,_tmpPhotoUrl,_tmpAge,_tmpProvider,_tmpCreatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
