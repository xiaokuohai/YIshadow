class MyList<T>
{
    private T[] date;
    private int size;

    public MyList()
    {
        this(10);//来个默认10
    }
    public MyList(int beginSize)
    {
        if (beginSize < 0)            //如果列表大小设置小于0,抛出异常
        {
            try
            {
                throw new Exception();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
            date = (T[]) new Object[beginSize];//强制转换
    }

    //列表大小
    public int size()
    {
        return size;
    }

    //判断是否为空
    public boolean isEmpty()
    {
        return size==0;
    }
    //增加元素
    public void add(T obj)
    {
        //数组扩容
        if(size>date.length-1)
        {
            T[] newArray = (T[])new Object[(size*3)/2+1];
            for(int i=0;i<date.length;i++)
            {
                newArray[i] = date[i];
            }
            date = newArray;
        }
        date[size++] = obj;
    }

    public T remove(int index)
    {
        if(index<0||index>=size)		//如果删除索引的位置小于0或大于数组长度，抛出异常
        {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        T oldDate = date[size-1];	//先保存值
        for(int i=index;i+1<size;i++)
        {
            date[i] = date[i+1];
        }
        return oldDate;
    }
    //删除
    public boolean remove(T t)
    {
        int j = 0;
        for(int i=0;i<size;i++)
        {
            if(t.equals(date[i]))
            {
                remove(i);
                return true;
            }
        }
        return false;
    }

    //根据索引获取某个元素
    public T get(int index)
    {
        if(index<0||index>=size)		//判断不合法，抛出异常
        {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return date[index];
    }

    public Iterator<T> Itr(){
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        private int current = 0;
        @Override
        public boolean hasNext() {
            return current < size;
        }//迭代

        @Override
        public T next() {
            T t1 = date[current++];
            return t1;
        }
    }
}


