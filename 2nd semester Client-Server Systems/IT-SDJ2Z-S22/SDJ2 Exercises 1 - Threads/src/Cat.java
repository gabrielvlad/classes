class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void sound(){
        System.out.println("Cat meows");
    }
}
