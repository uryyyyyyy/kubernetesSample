CREATE DATABASE s_k_sample
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

CREATE USER s_k_user@'%' IDENTIFIED BY 's_k_user';
GRANT ALL ON s_k_sample.* to 's_k_user'@'%';

CREATE DATABASE s_k_sample_test
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

CREATE USER s_k_test_user@'%' IDENTIFIED BY 's_k_test_user';
GRANT ALL ON s_k_sample_test.* to 's_k_test_user'@'%';