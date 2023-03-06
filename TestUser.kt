import java.util.ArrayList

class TestUser {
    fun main(args: Array<String>){
        val user1= User("ab@gmail.com","1234",17);
        val user2=User("ac@gmail.com","1256",18);

            val users = ArrayList<User>(2)
            users.add(user1)
            users.add(user2)

    }
}