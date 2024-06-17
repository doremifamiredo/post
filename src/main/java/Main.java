public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Сергей";
        post.patronymic = "Васильевич";
        post.surname = "Рахманинов";
        post.passport = "1234 № 1235678";
        post.phone = "+7 (987) 123-45-67";
        post.subscription = true;
        post.birthday.day = 1;
        post.birthday.month = 4;
        post.birthday.year = 1973;
    }
}
