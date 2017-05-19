using namespace std;

class MayJavaAccessThis {
    public:
        int a = 1;
        //int myFunction2(int, int);
    private:
        int b = 0;
};

int myFunction2(int a, int b){
    return a*b;
}