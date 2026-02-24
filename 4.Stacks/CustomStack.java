
class CustomStack{
    public static void main(String[] args){
        protected int[] data;
        private static final int DEFAULT_SIZE=10;
        int ptr=-1;
        //if no size given default will be taken
        public CustomStack(){
            this(DEFAULT_SIZE);
        }
        //if size that the data is given this constructer will be called
        public CustomStack(int size){
            this.data=new int[size];
        }

        public boolean push(int item){
            if (isFull()){
                System.out.println("Stack is full!");
            }
            ptr++;
            data[ptr]=item;
            return true;
        }
        public int pop(){
            if(isEmpty()){
                throw new Exception("cannot pop from an empty stack!");
            }
            // int removed =data[ptr];
            // ptr--;
            // return data[ptr--];
            return data[ptr--];
        }
        public int peek(){
             if(isEmpty()){
                throw new Exception("cannot peek from an empty stack!");
            }
            return data[ptr];
        }
        private boolean isFull(){
            return ptr== data.length-1;
        }
        private boolean isEmpty(){
            return ptr==-1;
        }
    }
}