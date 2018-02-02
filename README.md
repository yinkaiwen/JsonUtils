# Format
```
JsonUtils jsonUtils = new JsonUtils();
User user = jsonUtils.jsonString(User.class, "Json String");
User user = jsonUtils.jsonString(User.class, byte[]);
User user = jsonUtils.jsonString(User.class, InputStream);
```
