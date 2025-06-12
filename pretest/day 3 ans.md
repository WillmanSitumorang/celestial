1. b. `@Entity`
2. c. Menyediakan endpoint berbasis REST
3. Menangani request GET ke endpoint `/user`
4. a. `getAll()`
5. a. `@ManyToOne`
6. c. `application.properties`
7. b. `@Autowired`
8. c. `@Query`
9. b. Mengambil data JSON dari body request
10. c. Mengambil data dari path endpoint
11. True
12. True
13. False
14. True
15. False
16. @RestController menyediakan endoint berbasis REST
17. Membuat value
18. -
19. -
20. Membuat kolom full_name
21. Belum menggunakan `@Id`
@Entity
public class User {
    @id
    private Long id;
    private String name;
}
22. Beluam ada @RequestMapping
@RestController
@RequestMapping
public class HelloController {
    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello " + name;
    }
}
23. Pada table customer tambahkan field order_id yang terhubung dengan tabel order, sehingga satu customer dapat memiliki beberapa order
24. User ID: 123
25. -