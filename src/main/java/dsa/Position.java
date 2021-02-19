package dsa;
/*
 * 位置ADT接口
 */
public interface Position {
    //返回存放于该位置的元素
    Object getElem();

    //将给定元素存放至该位置，返回此前存放的元素
    Object setElem(Object e);
}
