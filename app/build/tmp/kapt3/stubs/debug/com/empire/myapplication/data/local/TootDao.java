package com.empire.myapplication.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u000f\u001a\u00020\fH\'J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00180\u00172\u0006\u0010\u0007\u001a\u00020\bH\'J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u00172\u0006\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00180\u0017H\'J\u0010\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0017H\'J\u0016\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u001fH\u00a7@\u00a2\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0019H\u00a7@\u00a2\u0006\u0002\u0010\'J\u0016\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020!H\u00a7@\u00a2\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u001dH\u00a7@\u00a2\u0006\u0002\u0010.J\u001e\u0010/\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00100\u001a\u000201H\u00a7@\u00a2\u0006\u0002\u00102J\u001e\u00103\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\f2\u0006\u00104\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u00105\u00a8\u00066"}, d2 = {"Lcom/empire/myapplication/data/local/TootDao;", "", "clearAllMessages", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllSessions", "clearSessionsForOwner", "ownerId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessageById", "messageId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessagesForSession", "sessionId", "deleteSession", "session", "Lcom/empire/myapplication/data/local/ChatSession;", "(Lcom/empire/myapplication/data/local/ChatSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSessionById", "deleteSourcesForMessage", "getMessagesForSession", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/empire/myapplication/data/local/Message;", "getMessagesForSessionOnce", "getSessionsForOwner", "getSourcesForMessage", "Lcom/empire/myapplication/data/local/SourceRef;", "getUserMemory", "Lcom/empire/myapplication/data/local/UserMemory;", "getUserProfile", "Lcom/empire/myapplication/data/local/UserProfile;", "insertMemory", "memory", "(Lcom/empire/myapplication/data/local/UserMemory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMessage", "message", "(Lcom/empire/myapplication/data/local/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProfile", "profile", "(Lcom/empire/myapplication/data/local/UserProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSession", "insertSource", "source", "(Lcom/empire/myapplication/data/local/SourceRef;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setMessageHasSources", "hasSources", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionTitle", "title", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface TootDao {
    
    @androidx.room.Query(value = "SELECT * FROM ChatSession WHERE ownerId = :ownerId ORDER BY createdAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.empire.myapplication.data.local.ChatSession>> getSessionsForOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String ownerId);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSession(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.local.ChatSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "UPDATE ChatSession SET title = :title WHERE id = :sessionId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSessionTitle(long sessionId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM ChatSession WHERE id = :sessionId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSessionById(long sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM ChatSession WHERE ownerId = :ownerId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearSessionsForOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String ownerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM ChatSession")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAllSessions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Message")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAllMessages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSession(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.local.ChatSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Message WHERE sessionId = :sessionId ORDER BY timestamp ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.empire.myapplication.data.local.Message>> getMessagesForSession(long sessionId);
    
    @androidx.room.Query(value = "SELECT * FROM Message WHERE sessionId = :sessionId ORDER BY timestamp ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMessagesForSessionOnce(long sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.empire.myapplication.data.local.Message>> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertMessage(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.local.Message message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Message WHERE sessionId = :sessionId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteMessagesForSession(long sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Message WHERE id = :messageId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteMessageById(long messageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM SourceRef WHERE messageId = :messageId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSourcesForMessage(long messageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM SourceRef WHERE messageId = :messageId")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.empire.myapplication.data.local.SourceRef>> getSourcesForMessage(long messageId);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSource(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.local.SourceRef source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE Message SET hasSources = :hasSources WHERE id = :messageId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setMessageHasSources(long messageId, boolean hasSources, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM UserMemory")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.empire.myapplication.data.local.UserMemory>> getUserMemory();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertMemory(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.local.UserMemory memory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM UserProfile LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.empire.myapplication.data.local.UserProfile> getUserProfile();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertProfile(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.local.UserProfile profile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}