## Message broker using Kafka

### Tạo 2 ứng dụng Spring boot trao đổi dữ liệu (JSON) với nhau thông qua Kafka
#### Gửi request
![Screenshot 2025-04-08 154104](https://github.com/user-attachments/assets/18c42fcc-8a71-4428-8ae6-cf3f7610310d)
#### Terminal App B sẽ in ra:
![Screenshot 2025-04-08 154115](https://github.com/user-attachments/assets/d5f73561-b0f5-4eef-9897-ca9707a1fe29)

### Nâng cấp Kafka thành cluster gồm 3 máy.
![Screenshot 2025-04-08 180526](https://github.com/user-attachments/assets/7688ee6d-d679-4ccf-b041-99e2d878ef42)
![Screenshot 2025-04-08 180638](https://github.com/user-attachments/assets/13ca2902-841a-426a-b3cf-7c611352c990)

### Kafka 2 làm leader trong partitions 0 => Dừng Kafka 2 
##### Vẫn nhận được request bình thường nhưng kèm theo Warnings trong log
![Screenshot 2025-04-08 185338](https://github.com/user-attachments/assets/87944b96-e41c-4bfe-9dbd-5758afa73fae)
