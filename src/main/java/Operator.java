public enum Operator{
        Add("+"){
            public int calculate(int firstNUM,int secondNUM){
                return firstNUM + secondNUM;
            }
        },
        Minus("-"){
            public int calculate(int firstNUM,int secondNUM){
                return firstNUM - secondNUM;
            }
        },
        Multiple("*"){
            public int calculate(int firstNUM,int secondNUM){
                return firstNUM * secondNUM;
            }
        },
        Divide("/"){
            public int calculate(int firstNUM,int secondNUM){
                return firstNUM / secondNUM;
            }
        };

        String value;
        Operator(String value){this.value = value;}
        public abstract int calculate(int firstNUM, int secondNUM);
    }

