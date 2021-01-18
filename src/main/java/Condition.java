public enum Condition {
    HOPE{
        public String toString() {
            return " hope ";
        }
    },
    SCARE{
        public String toString(){
            return " scare ";
        }
    },
    SURPRISE{
        public String toString(){
            return " surprised ";
        }
    },
    ANGRY{
        public String toString(){
            return " angry ";
        }
    };
    public String toString() {
        return "Condition{}";
    }
}
