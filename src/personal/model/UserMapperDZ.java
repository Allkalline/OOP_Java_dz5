package personal.model;

public class UserMapperDZ extends UserMapper {
    public String map(User user, String separator) {
        return String.join(separator, user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }


    public User map(String line, String separator) {
        String[] lines = line.split(separator);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
    
}
