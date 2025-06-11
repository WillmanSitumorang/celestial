1. B. Mengelola logika aplikasi dan komunikasi data dengan database
2. A. Menyembunyikan detail implementasi dan menyediakan akses lewat method
3. C. Meng-inject dependency otomatis ke dalam bean
4. A. Agar controller lebih ringan dan fokus pada request/response
5. C. `@GetMapping("/api")`
6. False
7. True
8. True
9. False
10. True
11. Backend berperan dalam mengelola API dan membuat query yang efisien
12. Class memiliki attribute dan method
13. Heritage (mewarisi method parent) dan polymorp (membuat objek sama dengan fungsi yang berbeda)
14. Untuk menandai class sebagai controller REST
15. IoC untuk membantu pembuatan objek dan AOP untuk membantu memisahkan logika yang berulang
16. Spring secara otomatis menyediakan dan menyuntikkan dependensi
17. Agar lebih fleksible terhadap perubahan pada controller
18. Class tidak bisa diotomatisasi
19. Untuk mengambil parameter di url (misal /user?nama:Willman) yang dikirim dari page lain
20. Dengan menggunakan @Service
21. -

```java
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello(); // error
    }
}
```

22. void dihilangkan

```java
public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}
```

23. tambah tipe data String pada name

```java
@RestController
public class GreetController {
    @PostMapping("/greet")
    public String greet(@RequestBody String name) {
        return "Hello, " + name;
    }
}
```

24. -

```java
@Service
public class InfoService {
    public String getInfo() {
        return "Info OK";
    }
}

// controller
@RestController
public class InfoController {
    @GetMapping("/info")
    public String get() {
        InfoService info = new InfoService(); // langsung di-new
        return info.getInfo();
    }
}
```

25. -

```java
@RestController
public class MathController {
    @GetMapping("/add")
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
```
