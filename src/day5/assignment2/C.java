package day5.assignment2;
class C extends B {
    @Override
    public void method() throws TopException {
        throw new TopException("Top exception from C");
    }
}
