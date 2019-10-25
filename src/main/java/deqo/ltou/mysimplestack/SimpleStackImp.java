package deqo.ltou.mysimplestack;

import sun.java2d.pipe.SpanShapeRenderer;

import java.util.EmptyStackException;

public class SimpleStackImp {

    private Item stack[] = new Item[100];
    private int indice = 0;

    SimpleStack s = new SimpleStack() {
        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int getSize() {
            return 0;
        }

        @Override
        public void push(Item item) {

        }

        @Override
        public Item peek() throws EmptyStackException {
            return null;
        }

        @Override
        public Item pop() throws EmptyStackException {
            return null;
        }
    };

    public void SimpleStackImp() throws Exception{
    }

    public void push (Item i){
        stack[indice]=i;
        indice++;
    }

    public int getSize(){
        return indice;
    }

    public Item pop(){
        Item ret = stack[indice-1];
        stack[indice]=null;
        indice--;
        return ret;
    }

    public boolean isEmpty() {
        return indice==0;
    }
}
