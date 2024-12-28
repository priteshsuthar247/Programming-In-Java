# Aim
<p>
  Write a program to create a checkbox to choose one option among the given choices.
</p>

<h2>Requirements</h2>

  1. Download JavaFX Library from the following link:
  - [Windows](https://download.java.net/java/GA/javafx22/d95151bba92e4a31a3170a68c917c699/30/openjfx-22_windows-x64_bin-sdk.zip)
  - [Linux](https://download.java.net/java/GA/javafx22/d95151bba92e4a31a3170a68c917c699/30/openjfx-22_linux-x64_bin-sdk.tar.gz)
  - [Apple Silicon Mac's](https://download.java.net/java/GA/javafx22/d95151bba92e4a31a3170a68c917c699/30/openjfx-22_macos-aarch64_bin-sdk.tar.gz)
  - [Intel Mac's](https://download.java.net/java/GA/javafx22/d95151bba92e4a31a3170a68c917c699/30/openjfx-22_macos-x64_bin-sdk.tar.gz)
  2. After Downloading the folder extract it.
  3. Copy the path of lib folder
     - Example:
       ```
       D:\Pritesh\Programs\Windows\javafx-sdk-22\lib

<h2>Compilation Codes:</h2>

```java
javac --module-path "D:\Pritesh\Programs\Windows\javafx-sdk-22\lib" --add-modules javafx.controls,javafx.fxml _38.java

java --module-path "D:\Pritesh\Programs\Windows\javafx-sdk-22\lib" --add-modules javafx.controls,javafx.fxml _38
```
>[!Note]
>Replace the path in
> ```java
> javac --module-path "D:\Pritesh\Programs\Windows\javafx-sdk-22\lib"
> ```
> With the path which you had copied in Step 3
