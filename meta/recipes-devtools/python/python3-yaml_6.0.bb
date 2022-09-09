SUMMARY = "Yaml for Python"
HOMEPAGE = "https://github.com/yaml/pyyaml"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8242660a8371add5fe547adf083079"

PYPI_PACKAGE = "PyYaml"

inherit pypi setuptools3

SRC_URI = "file://${PYPI_PACKAGE}-${PV}.tar.xz"
SRC_URI[sha256sum] = "3d9a6aea78d318bac5fb1b7131bdbee3c2e3c134e0ca7e7956d1e1325a8e9a74"

BBCLASSEXTEND = "native nativesdk"
