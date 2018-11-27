#!/usr/bin/env bash
java -cp security-1.0.jar com.lexx.security.ShowCryptoProviders
read -p "Press enter to continue"
java -cp security-1.0.jar com.lexx.security.ShowCryptoProviders 1
read -p "Press enter to continue"
java -cp security-1.0.jar com.lexx.security.SecurityJCE
