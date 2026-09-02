package androidx.media2.session;

import android.util.SparseArray;
import androidx.core.util.ObjectsCompat;
import androidx.versionedparcelable.VersionedParcelable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SessionCommandGroup implements VersionedParcelable {
    private static final String TAG = "SessionCommandGroup";
    Set<SessionCommand> mCommands;

    public SessionCommandGroup() {
        this.mCommands = new HashSet();
    }

    public SessionCommandGroup(Collection<SessionCommand> collection) {
        HashSet hashSet = new HashSet();
        this.mCommands = hashSet;
        if (collection != null) {
            hashSet.addAll(collection);
        }
    }

    public boolean hasCommand(SessionCommand sessionCommand) {
        if (sessionCommand == null) {
            throw new NullPointerException("command shouldn't be null");
        }
        return this.mCommands.contains(sessionCommand);
    }

    public boolean hasCommand(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Use hasCommand(Command) for custom command");
        }
        Iterator<SessionCommand> it = this.mCommands.iterator();
        while (it.hasNext()) {
            if (it.next().getCommandCode() == i) {
                return true;
            }
        }
        return false;
    }

    public Set<SessionCommand> getCommands() {
        return new HashSet(this.mCommands);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCommandGroup)) {
            return false;
        }
        SessionCommandGroup sessionCommandGroup = (SessionCommandGroup) obj;
        Set<SessionCommand> set = this.mCommands;
        if (set == null) {
            return sessionCommandGroup.mCommands == null;
        }
        return set.equals(sessionCommandGroup.mCommands);
    }

    public int hashCode() {
        return ObjectsCompat.hashCode(this.mCommands);
    }

    public static final class Builder {
        private Set<SessionCommand> mCommands;

        public Builder() {
            this.mCommands = new HashSet();
        }

        public Builder(SessionCommandGroup sessionCommandGroup) {
            if (sessionCommandGroup == null) {
                throw new NullPointerException("commandGroup shouldn't be null");
            }
            this.mCommands = sessionCommandGroup.getCommands();
        }

        public Builder addCommand(SessionCommand sessionCommand) {
            if (sessionCommand == null) {
                throw new NullPointerException("command shouldn't be null");
            }
            this.mCommands.add(sessionCommand);
            return this;
        }

        public Builder addAllPredefinedCommands(int i) {
            if (i < 1 || i > 2) {
                throw new IllegalArgumentException("Unknown command version " + i);
            }
            addAllPlayerCommands(i);
            addAllVolumeCommands(i);
            addAllSessionCommands(i);
            addAllLibraryCommands(i);
            return this;
        }

        public Builder removeCommand(SessionCommand sessionCommand) {
            if (sessionCommand == null) {
                throw new NullPointerException("command shouldn't be null");
            }
            this.mCommands.remove(sessionCommand);
            return this;
        }

        Builder addAllPlayerCommands(int i) {
            addAllPlayerBasicCommands(i);
            addAllPlayerPlaylistCommands(i);
            return this;
        }

        Builder addAllPlayerBasicCommands(int i) {
            addCommands(i, SessionCommand.VERSION_PLAYER_BASIC_COMMANDS_MAP);
            return this;
        }

        Builder addAllPlayerPlaylistCommands(int i) {
            addCommands(i, SessionCommand.VERSION_PLAYER_PLAYLIST_COMMANDS_MAP);
            return this;
        }

        Builder addAllVolumeCommands(int i) {
            addCommands(i, SessionCommand.VERSION_VOLUME_COMMANDS_MAP);
            return this;
        }

        Builder addAllSessionCommands(int i) {
            addCommands(i, SessionCommand.VERSION_SESSION_COMMANDS_MAP);
            return this;
        }

        Builder addAllLibraryCommands(int i) {
            addCommands(i, SessionCommand.VERSION_LIBRARY_COMMANDS_MAP);
            return this;
        }

        private void addCommands(int i, SparseArray<List<Integer>> sparseArray) {
            for (int i2 = 0; i2 < sparseArray.size() && sparseArray.keyAt(i2) <= i; i2++) {
                Iterator<Integer> it = sparseArray.valueAt(i2).iterator();
                while (it.hasNext()) {
                    addCommand(new SessionCommand(it.next().intValue()));
                }
            }
        }

        public SessionCommandGroup build() {
            return new SessionCommandGroup(this.mCommands);
        }
    }
}
