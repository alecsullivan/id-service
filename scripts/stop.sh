#!/bin/bash
if service --status-all | grep -Fq 'id-service'; then
  service id-service stop
fi