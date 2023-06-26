package com.consulti.templatespringboot.services;

import com.consulti.templatespringboot.models.*;
import java.util.*;
import org.springframework.stereotype.*;

@Service
public interface PaymentsService {
  List<PaymentsModel> listar() throws Exception;

  PaymentsModel save(String request) throws Exception;

  PaymentsModel update(PaymentsModel request) throws Exception;

  Boolean delete(PaymentsModel request) throws Exception;
}
