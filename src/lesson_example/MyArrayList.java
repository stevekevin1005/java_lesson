package lesson_example;

class MyArrayList {
    private int[] array;
    private int size;

    // 初始容量為10
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // 添加元素方法
    public void add(int element) {
        // 當超過容量時進行擴容
        if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }

    // 擴容方法
    private void resize() {
        System.out.println("resize list");
        int newCapacity = array.length + (array.length / 2); // 擴展 1.5 倍
        int[] newArray = new int[newCapacity];
        // 手動複製元素
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray; // 更新參考到新的擴容後陣列
    }

    // 獲取元素方法
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    // 獲取列表大小
    public int size() {
        return size;
    }


    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // 添加元素測試
        for (int i = 0; i < 15; i++) {
            list.add(i);
            System.out.println("Added " + i + " to list. Size: " + list.size());
        }

        // 確認列表大小
        System.out.println("Final size: " + list.size()); // 預期結果：15

        // 獲取元素測試
        System.out.println("Elements in list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // 預期輸出：0 1 2 ... 14
        }
    }
}
