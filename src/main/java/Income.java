public enum Income {
    RICH{
        public String toString() {
            return " income doubles ";
        }
    },
    POOR{
        public String toString(){
                return " income halved ";
        }
    },
    INCREASE{
        public String toString(){
            return " increase the production of ";
        }
    },
    MONEY{
        public String toString(){
            return " made a lot of money ";
        }
    }
}
