public interface IMatrix {
    double getIJ(int i, int j);
    void setIJ(int i, int j, double element);

    double getDeterminant();
}