SUMMARY = "Yaml for Python"
HOMEPAGE = "https://github.com/yaml/pyyaml"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8242660a8371add5fe547adf083079"

PYPI_PACKAGE = "PyYaml"

inherit pypi setuptools3

DEPENDS += "python3-setuptools-native python3-native"

# FILESEXTRAPATHS_append := "${THISDIR}/files/:"

# SRC_URI_remove = "https://files.pythonhosted.org/packages/source/P/PyYaml/PyYaml-6.0.tar.gz"

SRC_URI = "file://PyYaml-6.0.tar.xz"
SRC_URI[sha256sum] = "3d9a6aea78d318bac5fb1b7131bdbee3c2e3c134e0ca7e7956d1e1325a8e9a74"

# SRC_URI[sha256sum] = "a6b92d61a7a16cde1f8ec872d3279b5f8ab4e454424ac08b967c9bdccfb6a424"

BBCLASSEXTEND = "native nativesdk"
