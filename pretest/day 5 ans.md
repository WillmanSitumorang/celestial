1. Untuk authentication dan authorization
2. @HttpSecurity
3. Untuk mengaktifkan web security
4. Memastikan bahwa user yang memiliki password yang dapat mengakses layanan
5. Inisiasi authorization sebagai role admin 
6. 
7. Metode enkripsi dengan random salt yang kompatible untuk menyimpan password
8. Junit Jupiter
9. Untuk membuat mock dari sebuah bean
10. Mensimulasikan user yang sudah login dengan role tertentu saat testing
11. @WebMvcTest hanya meng-test layer controller, @SpringBootTest meng-test seluruh aplikasi (integrasi)
12. Mengeksekusi kode sebelum setiap test 
13. False
14. True
15. False
16. True
17. False
18. Memvalidasi credentials (username/password) 
19. Meng-hash password untuk disimpan di database, penting untuk menghindari kebocoran data
20. Untuk menentukan hak akses user terhadap resource
21. _test double_ membuat objek palsu saat testing, _mock_ salah satu jenis _test double_
22. Untuk menguji controller Spring MVC secara terisolasi 
23. kesalahan injeksi atau untuk encode
@Autowired
private PasswordEncoder passwordEncoder;
@Bean
private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
24. tidak perlu username dan yg di-test admin
@WithMockUser(roles = "ADMIN")
@Test
void testAccessAdminEndpoint() {
    mockMvc.perform(get("/admin")).andExpect(status().isOk());
}
25. sudah otomatis
@Mock
UserService userService;
26. Pilih salah satu antara @SpringBootTest atau @WebMvcTest
@SpringBootTest
public class MyTest {
}
27. Hasil tidak sama karna dibandingkan dengan plain text, solusi bandingkan dengan hasil encode juga
@Test
void testPasswordHash() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    String hashed = encoder.encode("mypassword");
    assertTrue(encoder.matches("mypassword", hashed));
}
28. Unauthorized seharusnya bukan direspon ok
@Test
void testUnauthorizedAccess() {
    mockMvc.perform(get("/secure-data"))
           .andExpect(status().isUnauthorized());
} 
29. -
30. return null tetapi assertNotNull
@Test
void testLogin() {
    when(authService.login("user", "pass")).thenReturn(new User());
    assertNotNull(authService.login("user", "pass"));
}