package default_examples;

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("defaultExamples.Cat eats");
    }

    @Override
    public void sound(){
        System.out.println("defaultExamples.Cat meows");
    }
}
