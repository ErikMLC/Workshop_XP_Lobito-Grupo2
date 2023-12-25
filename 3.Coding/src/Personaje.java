import java.util.Set;

public enum Personaje {
    OBSERVER,
    WOLF,
    GRAPES {
        @Override
        public boolean isSafe(final Set<Member> others) {
            return others.contains(OBSERVER) || !others.contains(REDHOOD);
        }

        @Override
        public boolean isUnsafe(final Set<Member> others) {
            return !isSafe(others);
        }
    },
    REDHOOD {
        @Override
        public boolean isSafe(final Set<Member> others) {
            return others.contains(OBSERVER) || !others.contains(WOLF);
        }

        @Override
        public boolean isUnsafe(final Set<Member> others) {
            return !isSafe(others);
        }
    };

    public boolean isSafe(final Set<Member> others) {
        return true;
    }

    public boolean isUnsafe(final Set<Member> others) {
        return !isSafe(others);
    }
}