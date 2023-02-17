package Queues.in_class;

static Queue<Integer> ReverseK(Queue<Integer> queue, int k) {
        if( k<0 || k>queue.size()){
        return null;
        }
        Stack<Integer>stack = new Stack<>();
        for(int i=0; i<k; i++){
        stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
        queue.add(stack.pop());
        }
        for (int i = 0; i < queue.size() - k; i++) {
        queue.add(queue.remove());
        }

        return queue;
        }
