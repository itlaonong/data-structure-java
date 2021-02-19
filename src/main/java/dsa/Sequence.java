package dsa;

public interface Sequence {
    int getSize();

    Object getAtRank(int j);

    void replaceAtRank(int j, Object atRank);
}
