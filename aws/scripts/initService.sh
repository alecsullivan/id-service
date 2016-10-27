#!/bin/bash
if [ ! -L /etc/init.d/id-service ]
then
  ln -s /var/id-service/*.jar /etc/init.d/id-service
fi