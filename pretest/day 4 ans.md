1. C. `@RestController`
2. A. `@Autowired`
3. D. Menyimpan logika bisnis
4. C. Menyimpan struktur data (seperti data user, produk, dll.)
5. `@GetMapping("/hello")`
6. False
7. True
8. True
9. False 
10. False
11. @PostMapping
12. application.properties
13. Syntax untuk menghubungkan dependency, bisa dilakukan secara otomatis dengan @Autowired
14. Menggunakan @Service
15. @RestController berbasis API
16. Tambahkan @Controller
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
17. Tambahkan @Entity dan @Data
@Entity
@Data
public class Product {
    private String name;
    private int price;
}
18. 5
19. userRepository belum di Inject
@Service
public class UserService {
    private UserRepository userRepository;
    publuc class UserService (UserRepository userRepository){this.userRepository = userRepository}
}
20. Belum ada @RequestMapping
@RestController
@RequestMapping
public class BookController {

    @GetMapping
    public String listBooks() {
        return "books";
    }
}
21. A. `@EnableSecurity`
22. C. `AuthenticationManager`
23. C. `UserDetailsService`
24. False
25. True
26. True
27. @SpringSecurity
28. @PreAuthorize
29. -
30. -

