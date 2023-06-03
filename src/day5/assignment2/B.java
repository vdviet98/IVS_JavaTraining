package day5.assignment2;
class B extends A {
    @Override
    public void method() throws MiddleException {
        throw new MiddleException("Middle exception from B");
    }
}
