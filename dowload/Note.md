

## 0\. Đồ chơi và Công cụ

### I. IDE (Integrated Development Environment)

Intellij Ultimate

### II. JDK (Java Development Kit)

Từ phiên bản 21 trở lên, tốt nhất là 24.

  - **Tải JDK:**

> [\!NOTE] Quan trọng
> Cài JDK trước, sau đó mới cài các ứng dụng khác.

  - **Đường dẫn tới JDK sau khi cài xong:**

    ```
    C:\Program Files\Java\jdk-25
    ```

  - **Thư mục `bin` (nơi chứa các tệp thực thi):**

  - **Cách xem đuôi file chi tiết:**
    Vào **View** -\> **Show** -\> **File name extensions**.

  - **Ba tập tin quan trọng nhất trong Java:**

      - **`javac`**: Trình biên dịch Java (Java Compiler).
      - **`java.exe`**: Máy ảo Java (Java Virtual Machine).
      - **`javadoc.exe`**: Công cụ tạo tài liệu Java.

  - **Mở terminal để thao tác kiểm tra:**

-----

## 1\. Thiết lập Biến môi trường (Environment Variables)

### Biến (Variable) là gì?

  * **Trong Toán học:** `x = 10`. Biến là tên gọi cho một giá trị.
  * **Trong Lập trình:** `int yob = 2004;` hoặc `double total = 45000.0;`.
      * Biến là tên gọi cho một giá trị.
      * Giá trị này được lưu ở trong RAM.
      * Biến này được các hàm trong ứng dụng sử dụng.
    > Tóm lại: **Biến là tên gọi cho một vùng RAM lưu trữ giá trị để các hàm sử dụng.**
  * **Trong Hệ điều hành (Windows, Linux, macOS):**
      * Hệ điều hành cũng có các biến để lưu giá trị, được gọi là **biến môi trường**.
      * Biến môi trường là tên gọi cho một vùng RAM do hệ điều hành quản lý để lưu trữ giá trị (dưới dạng chuỗi).
      * Biến này lưu thông tin, chuỗi ký tự để chia sẻ cho các ứng dụng cùng dùng.

-----

### Các loại biến môi trường trong Hệ điều hành (OS)

Có hai loại biến môi trường chính:

1.  **Biến có sẵn của hệ điều hành:**

      * Đây là các biến được tạo ra khi cài đặt hệ điều hành để các ứng dụng hệ thống sử dụng.
      * Ví dụ điển hình là biến **`Path`**. Khi bạn gõ một lệnh trong `CMD` hay `PowerShell`, hệ điều hành sẽ tự động tìm trong các đường dẫn được liệt kê trong biến `Path` để xem có tệp thực thi nào khớp với lệnh đó không. Nếu có thì chạy, nếu không thì báo lỗi.

2.  **Biến do người dùng tạo ra:**

      * Khi các ứng dụng cần dùng chung một thông tin quan trọng nào đó, ta có thể tạo một biến môi trường để lưu thông tin đó.

      * **Ví dụ với JDK:** JDK là nền tảng cho các ứng dụng Java khác.

          * Nơi cài đặt JDK có thể tùy chọn (`C:\`, `D:\`, `E:\`).
          * Để các ứng dụng khác (như IntelliJ, Eclipse, NetBeans) biết JDK được cài ở đâu, ta tạo một biến môi trường tên là **`JAVA_HOME`**.
            ```
            JAVA_HOME = "C:\Program Files\Java\jdk-24"
            ```
          * Các IDE chỉ cần hỏi hệ điều hành giá trị của `JAVA_HOME` để tìm đến thư mục cài đặt JDK và sử dụng các công cụ trong thư mục `bin`.

      * Sau đó, thay vì thêm đường dẫn trực tiếp vào biến `Path`, ta sử dụng `%JAVA_HOME%\bin`. Bằng cách này, khi muốn thay đổi phiên bản JDK, bạn chỉ cần cập nhật lại giá trị của biến `JAVA_HOME`.

> ### Chốt hạ: Cài đặt biến môi trường cho công cụ lập trình
>
>   * **Biến `..._HOME`**: Trỏ đến thư mục gốc nơi cài đặt công cụ.
>   * **Biến `Path`**: Trỏ đến thư mục `bin` của công cụ để có thể chạy lệnh từ bất cứ đâu.
>
> #### "HOME nơi cài, BIN nơi chạy\!"
>
>   * **`JAVA_HOME`**: Trỏ đến nơi cài **JDK**.
>   * **`Path`**: Thêm `%JAVA_HOME%\bin`.
>   * **`CATALINA_HOME`**: Trỏ đến nơi cài **Tomcat**.
>   * **`Path`**: Thêm `%CATALINA_HOME%\bin`.
>   * **`M2_HOME`**: Trỏ đến nơi cài **Maven**.
>   * **`Path`**: Thêm `%M2_HOME%\bin`.
>   * Tương tự với **Git, Python, NodeJS...**

-----

## 2\. Cài đặt IDE (IntelliJ)

  * Trong quá trình cài đặt, sẽ có tùy chọn hỏi bạn có muốn cập nhật thư mục `bin` của IntelliJ vào biến môi trường `Path` hay không.
  * Nếu chọn, bạn có thể mở IntelliJ trực tiếp từ dòng lệnh.