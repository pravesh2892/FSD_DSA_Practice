package Queues.in_class;

/*
 static Stack<Integer> s1 = new Stack<Integer>();
 static Stack<Integer> s2 = new Stack<Integer>();
*/

static void enQueue(int x)
        {
        while(!s1.isEmpty()){
        s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()){
        s1.push(s2.pop());
        }
        }

static void deQueue()
        {
        s1.pop();
        }
static void Print1(){
        System.out.println(s1.peek());
        }
