# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "JSON transport for ROS"
AUTHOR = "Paul Bovbel <pbovbel@locusrobotics.com>"
ROS_AUTHOR = "Paul Bovbel <pbovbel@locusrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=37;endline=37;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "json_transport"
ROS_BPN = "json_transport"

ROS_BUILD_DEPENDS = " \
    json-msgs \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    json-msgs \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-msgpack} \
    json-msgs \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/locusrobotics/json_transport-release/archive/release/melodic/json_transport/0.0.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/json_transport"
SRC_URI = "git://github.com/locusrobotics/json_transport-release;${ROS_BRANCH};protocol=https"
SRCREV = "8cffe73e4123f4f2b71a34108a1ae39c04653583"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}